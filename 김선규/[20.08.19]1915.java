package Baekjoon.solve_01000;

import java.util.Scanner;

public class Baekjoon1915 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] dp = new int[n+1][m+1];
		
		int max = 0;
		for(int i = 1; i <= n; i++) {
			String s = sc.next();
			for(int j = 0; j < m; j++) {
				if(s.charAt(j) == '0') continue;
				int num = Math.min(dp[i][j], Math.min(dp[i-1][j], dp[i-1][j+1]));
				dp[i][j+1] = num+1;
				max = Math.max(max, num+1);
			}
		}
		System.out.print(max*max);
	}
}
