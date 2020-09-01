package Baekjoon.solve_10000;

import java.util.Scanner;

public class Baekjoon14494 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] dp = new int[n+1][m+1];
		
		dp[0][0] = 1;
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= m; j++) {
				dp[i][j] = ((dp[i-1][j] + dp[i][j-1]) % 1000000007 + dp[i-1][j-1]) % 1000000007;
			}
		}
		
		System.out.print(dp[n][m]);
	}
}
