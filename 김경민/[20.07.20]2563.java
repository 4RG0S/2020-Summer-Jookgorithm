package July;

import java.util.Scanner;

public class July_20_2563 {
	
	static boolean black[][];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		black = new boolean[101][101];
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		for(int i=0;i<N;i++)
		{
			int x = scan.nextInt();
			int y = scan.nextInt();
			for(int j=x;j<x+10;j++)
			{
				for(int k=y;k<y+10;k++)
				{
					black[k][j] = true;
					//System.out.println(x + " " + y +"change");
				}
			}
		}
		int result = 0;
		for(int i=1;i<101;i++)
		{
			for(int j=1;j<101;j++)
			{
				if(black[i][j])
					result++;
			}
		}
		System.out.println(result);
	}

}
