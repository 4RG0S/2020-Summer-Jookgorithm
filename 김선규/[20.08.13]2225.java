package Baekjoon.solve_02000;

import java.util.Scanner;

public class Baekjoon2225 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[][] dp = new int[201][201];
		
		for(int i = 0; i <= 200; i++) {
			dp[i][1] = 1;
			dp[0][i] = 1;
		}
		
		for(int i = 2; i <= 200; i++) {
			for(int j = 1; j <= 200; j++) {
				dp[j][i] = (dp[j-1][i] + dp[j][i-1])%1000000000;
			}
		}
		
		System.out.print(dp[n][k]);
	}
}
