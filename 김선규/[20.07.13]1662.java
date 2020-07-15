package Baekjoon.solve_01000;

import java.util.Scanner;
import java.util.Stack;

public class Baekjoon1662 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		Stack<Integer> st = new Stack<>();
		st.push(0);
		for(int i = 0; i < s.length(); i++) {
			try {
				if(s.charAt(i) == ')') {
					int a = st.pop();
					while(st.lastElement() != -1) {
						a += st.pop();
					}
					st.pop();
					a = a * st.pop();
					st.push(a);
				}else if(s.charAt(i) == '(') {
					st.push(-1);
					st.push(0);
				}else if(s.charAt(i+1) == '('){
					st.push(s.charAt(i)-48);
				}else {
					int a = st.pop();
					st.push(a+1);
				}
			}catch(Exception e) {
				int a = st.pop();
				st.push(a+1);
			}
		}
		int a = 0;
		while(st.size() != 0) {
			a += st.pop();
		}
		System.out.print(a);
	}
}
