package Baekjoon.solve_01000;

import java.util.*;

public class Baekjoon1918 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		String an = "";
		Stack<Character> st = new Stack<>();
		
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(c == '+' || c == '-') {
				while(!st.isEmpty() && (st.peek() == '+' || st.peek() == '-' || st.peek() == '*' || st.peek() == '/')) {
					an += st.pop();
				}
				st.push(c);
			}else if(c == '*' || c == '/') {
				while(!st.isEmpty() && (st.peek() == '*' || st.peek() == '/')) {
					an += st.pop();
				}
				st.push(c);
			}else if(c == '(') {
				st.push(c);
			}else if(c == ')') {
				while(st.peek() != '(') {
					an += st.pop();
				}
				st.pop();
			}else {
				an += c;
			}
		}
		while(!st.empty()) {
			an += st.pop();
		}
		
		System.out.print(an);
	}
}
