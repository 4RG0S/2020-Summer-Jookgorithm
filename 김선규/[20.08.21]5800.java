package Baekjoon.solve_05000;

import java.util.*;

public class Baekjoon5800 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();
		for(int j = 1; j <= k; j++) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i = 0; i < n; i++)
				arr[i] = sc.nextInt();
			
			Arrays.sort(arr);
			int gap = 0;
			for(int i = 1; i < n; i++) {
				gap = Math.max(gap, arr[i] - arr[i-1]);
			}
			System.out.println("Class " + j);
			System.out.println("Max " + arr[n-1] + ", Min " + arr[0] + ", Largest gap " + gap);
		}
	}
}
