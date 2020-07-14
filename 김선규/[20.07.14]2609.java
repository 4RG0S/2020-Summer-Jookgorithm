package Baekjoon.solve_02000;

import java.util.Scanner;

public class Baekjoon2609 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int max = Math.max(a, b);
		int min = Math.min(a, b);
		while(min > 0) {
            int tmp = max;
            max = min;
            min = tmp % min;
        }
		System.out.println(max);
		System.out.print(a*b/max);
	}
}
