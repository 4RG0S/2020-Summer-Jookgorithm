package Baekjoon.solve_02000;

import java.util.Scanner;

public class Baekjoon2941 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		int size = s.length();
		for(int i = 1; i < s.length(); i++) {
			char c1 = s.charAt(i-1);
			char c2 = s.charAt(i);
			if(c2 =='=') {
				if(c1 == 'c') {
					size--;
				}else if(c1 == 's') {
					size--;
				}else if(c1 == 'z') {
					size--;
					try {
						if(s.charAt(i-2) == 'd') {
							size--;
						}
					}catch(Exception e){}
				}
			}else if(c2 == '-') {
				if(c1 == 'c') {
					size--;
				}else if(c1 == 'd') {
					size--;
				}
			}else if(c2 == 'j') {
				if(c1 == 'l') {
					size--;
				}else if(c1 == 'n') {
					size--;
				}
			}
		}
		System.out.print(size);
	}
}
