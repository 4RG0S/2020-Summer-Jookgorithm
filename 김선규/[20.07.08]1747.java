package Baekjoon.solve_01000;

import java.util.Scanner;

public class Baekjoon1747 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		boolean[] arr = new boolean[1003002];
		arr[1] = true;
		for (int i = 2; i * i <= 1003001; i++) {
			if(arr[i])continue;
			for (int j = i * i; j <= 1003001; j += i) {
				arr[j] = true;	// 소수이면 false
			}
		}
		for(int i = n; i <= 1003001; i++) {
			if(arr[i]) continue;
			if(func(Integer.toString(i))) {
				System.out.print(i);
				break;
			}
		}
	}
	
	public static boolean func(String s) {
		boolean pal = true;
		int left = 0;
		int right = s.length()-1;
		while(left < right && pal) {
			if(s.charAt(left) != s.charAt(right)) {
				pal = false;
			}
			left++;
			right--;
		}
		return pal;
	}
}
