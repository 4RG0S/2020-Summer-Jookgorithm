package Baekjoon.solve_01000;

import java.util.Scanner;

public class Baekjoon1676 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int c = 0;
		int num = n;
		while (--n > 0) {
			num *= n;
			while (num % 10 == 0) {
				num /= 10;
				c++;
			}
			num %= 1000000;
		}
		System.out.println(c);
	}
}
