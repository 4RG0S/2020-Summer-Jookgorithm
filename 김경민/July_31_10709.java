package July;

import java.util.Scanner;

public class July_31_10709 {
	
	static int result[][];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int H = scan.nextInt();
		int W = scan.nextInt();
		scan.nextLine();
		char arr[][] = new char[H][W];
		result = new int[H][W];
		for(int i=0;i<H;i++)
		{
			for(int j=0;j<W;j++)
			{
				result[i][j] = -1;
			}
		}
		for(int i=0;i<H;i++)
		{
			String line = scan.nextLine();
			for(int j=0;j<W;j++)
			{
				arr[i][j] = line.charAt(j);
				if(arr[i][j] == 'c')
					result[i][j] = 0;
			}
		}
		for(int i=0;i<H;i++)
		{
			for(int j=0;j<W;j++)
			{
				for(int k=j;k>=0;k--)
				{
					if(result[i][k] == 0)
					{
						result[i][j] = j - k;
						break;
					}
				}
			}
		}
		for(int i=0;i<H;i++)
		{
			for(int j=0;j<W;j++)
			{
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}

}
