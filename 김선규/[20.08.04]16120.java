package Baekjoon.solve_15000;

import java.util.*;

public class Baekjoon16120 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		Stack<Character> st = new Stack<>();
		for(int i = 0; i < s.length(); i++) {
			st.push(s.charAt(i));
			if(st.size() > 3) {
				char f = st.pop();
				char t = st.pop();
				char w = st.pop();
				char o = st.pop();
				if(o == 'P' && w == 'P' && t == 'A' && f == 'P') {
					st.push(o);
				}else {
					st.push(o);
					st.push(w);
					st.push(t);
					st.push(f);
				}
			}
		}
		if(st.size() == 1 && st.pop() == 'P') {
			System.out.print("PPAP");
		}else {
			System.out.print("NP");
		}
	}
}
