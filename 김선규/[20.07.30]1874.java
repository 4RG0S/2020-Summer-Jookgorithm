package Baekjoon.unsolve;

import java.util.*;

public class Baekjoon1874 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int num = 1;
		Stack<Integer> st = new Stack<>();
		Queue<Character> an = new LinkedList<>();
		Queue<Integer> qu = new LinkedList<>();
		for(int i = 0; i < n; i++) {
			qu.offer(sc.nextInt());
		}
		
		st.push(0);
		while(!qu.isEmpty()) {
			int i = qu.poll();
			for(; num <= n && st.peek() != i; num++) {
				st.push(num);
				an.offer('+');
			}
			if(st.peek() == i) {
				st.pop();
				an.offer('-');
			}
		}
		
		if(st.size() == 1) {
			while(!an.isEmpty()) {
				System.out.println(an.poll());
			}
		}else {
			System.out.print("NO");
		}
	}
}
