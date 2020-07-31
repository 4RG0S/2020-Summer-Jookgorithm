package Baekjoon.solve_01000;

import java.util.*;

public class Baekjoon1920 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		
		int m = sc.nextInt();
		for(int i = 0; i < m; i++) {
			int num = sc.nextInt();
			int first = 0;
			int last = n-1;
			boolean fine = false;
			while(first <= last) {
				int mid = (first + last) / 2;
				if(arr[mid] == num) {
					fine = true;
					break;
				}
				if(arr[mid] > num) {
					last = mid - 1;
				}else {
					first = mid + 1;
				}
			}
			if(fine) {
				System.out.println(1);
			}else {
				System.out.println(0);
			}
		}
	}
}
