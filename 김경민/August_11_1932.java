package August;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class August_11_1932 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int result = Integer.MIN_VALUE;
		int arr[][] = new int[n+1][n+1];
		int sum[][] = new int[n+1][n+1];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
				arr[i][j] = -1;
		}
		for(int i=0;i<n;i++)
		{
			StringTokenizer line = new StringTokenizer(br.readLine(), " ");
			int j=0;
			while(line.hasMoreTokens())
			{
				arr[i][j] = Integer.parseInt(line.nextToken());
				j++;
			}
		}
		sum[0][0] = arr[0][0];
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<i;j++)
			{
				sum[i][j] = Integer.max(sum[i-1][j] + arr[i][j], sum[i][j]);
				sum[i][j+1] = Integer.max(sum[i-1][j] + arr[i][j+1], sum[i][j+1]);
				int max = Integer.max(sum[i][j], sum[i][j+1]);
				if(max > result)
					result = max;
			}
		}/*
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<=i;j++)
				System.out.print(sum[i][j] + " ");
			System.out.println();
		}*/
		System.out.println(result);
	}

}
