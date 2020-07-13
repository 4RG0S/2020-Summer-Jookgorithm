package Baekjoon.solve_02000;

import java.util.Scanner;

public class Baekjoon2553 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		long num = n;
		while(--n>0) {
			num *= n;
			while(num % 10 == 0) {
				num /= 10;
			}
			num %= 1000000;
		}
		num %= 10;
		System.out.println(num);
	}
}
