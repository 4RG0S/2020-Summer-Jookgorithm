package Baekjoon.solve_10000;

import java.util.Scanner;

public class Baekjoon11057 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int an = 1;
		int[][] dp = new int[n+1][10];
		
		for(int i = 1; i <= n; i++) {
			dp[i][0] = an;
			for(int j = 1; j < 10; j++) {
				dp[i][j] = (dp[i][j-1] - dp[i-1][j-1] + 10007) % 10007;
				an += dp[i][j];
			}
			an %= 10007;
		}
		
		System.out.print(an);
	}
}
