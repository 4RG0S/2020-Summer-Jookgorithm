package Baekjoon.solve_10000;

import java.util.*;

public class Baekjoon10867 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Set<Integer> s = new TreeSet<>();
		for(int i = 0; i < n; i++) {
			s.add(sc.nextInt());
		}
		for(int i: s) {
			System.out.print(i + " ");
		}
	}
}
