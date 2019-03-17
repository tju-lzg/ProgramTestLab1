package lab1;

public class program {
	public int [] money= {0,50,20,5,5,1,1,1};
	public boolean check(int number) {
		int len=money.length;
		int [][] result=new int[100][100];
		if (number<=0) {
			return false;
		}
		for (int i=1;i<len;i++) {
			for (int j=1;j<=number;j++) {
				if (j<money[i]) {
					result[i][j]=result[i-1][j];
				}
				else {
					result[i][j]=Math.max(result[i-1][j],result[i-1][j-money[i]]+money[i]);
				}
			}
		}
		if (number==result[len-1][number])
			return true;
		else
			return false;
	}
}
