package July;

import java.util.Scanner;

public class July_15_2133 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int dp[] = new int[N + 1];
		
		int answer = 0;
		if(N % 2 == 0)
		{
			dp[2] = 3;
			dp[0] = 1;
			for(int i=4;i<=N;i+=2)
			{
				for(int j=2;j<=i;j+=2)
				{
					int std = j == 2 ? 3 : 2;
					dp[i] += std * dp[i - j];
				}
			}
			answer = dp[N];
		}
		System.out.println(answer);
	}

}
