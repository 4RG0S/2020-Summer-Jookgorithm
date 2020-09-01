package Baekjoon.solve_01000;

import java.util.*;

public class Baekjoon1316 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int c = 0;
		while(n-->0) {
			String s = sc.next();
			List<Character> l = new ArrayList<>();
			c++;
			for(int i = 0; i < s.length(); i++) {
				if(l.contains(s.charAt(i)) && s.charAt(i-1) != s.charAt(i)) {
					c--;
					break;
				}
				l.add(s.charAt(i));
			}
		}
		System.out.print(c);
	}
}
