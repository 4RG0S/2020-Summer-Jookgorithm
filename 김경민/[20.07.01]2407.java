package June;

import java.math.BigInteger;
import java.util.Scanner;

public class June_30_2407 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		BigInteger value[][] = new BigInteger[101][101];
		for(int i=0;i<101;i++)
		{
			for(int j=0;j<101;j++)
				value[i][j] = BigInteger.valueOf(0);
		}
		for(int i=0;i<101;i++)
		{
			value[i][0] = BigInteger.valueOf(1);
			value[i][1] = BigInteger.valueOf(i);
		}
		for(int i=1;i<101;i++)
		{
			for(int j=2;j<101;j++)
			{
				value[i][j] =value[i][j].add(value[i-1][j-1]);
				value[i][j] =value[i][j].add(value[i-1][j]);
			}
		}
		System.out.println(value[n][m]);
	}

}
