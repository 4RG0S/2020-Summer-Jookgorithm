package Baekjoon.solve_01000;

import java.util.Scanner;

public class Baekjoon1934 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		while (t-- > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int m = a * b;
			while (b > 0) {
				int tmp = a;
				a = b;
				b = tmp % b;
			}
			System.out.println(m / a);
		}
	}
}
