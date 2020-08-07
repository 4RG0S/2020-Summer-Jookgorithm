package Baekjoon.solve_02000;

import java.util.Scanner;

public class Baekjoon2023 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		func("2", n);
		func("3", n);
		func("5", n);
		func("7", n);
	}

	public static void func(String s, int n) {
		int num = Integer.parseInt(s);
		for (int j = 2; j < num; j++) {
			if (num % j == 0) {
				return;
			}
		}
		if (n == 1) {
			System.out.println(s);
			return;
		}
		func(s+"1", n-1);
		func(s+"3", n-1);
		func(s+"5", n-1);
		func(s+"7", n-1);
		func(s+"9", n-1);
	}
}
