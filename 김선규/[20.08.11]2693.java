package Baekjoon.solve_02000;

import java.util.*;

public class Baekjoon2693 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		while(t-->0) {
			int[] arr = new int[10];
			for(int i = 0; i < 10; i++)
				arr[i] = sc.nextInt();
			Arrays.sort(arr);
			System.out.println(arr[7]);
		}
	}
}
