package Baekjoon.solve_10000;

import java.util.Scanner;

public class Baekjoon11051 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[][] dp = new int[n+1][n+1];
		for(int i = 0; i <= n; i++) {
			dp[i][0] = 1;
			dp[i][i] = 1;
		}
		
		for(int i = 2; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				dp[i][j] = (dp[i-1][j] + dp[i-1][j-1]) % 10007;
			}
		}
		
		System.out.print(dp[n][k]);
	}
}
