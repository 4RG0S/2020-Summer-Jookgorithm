package Baekjoon.solve_15000;

import java.io.*;
import java.util.*;

public class Baekjoon17298 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) );
		StringTokenizer st = new StringTokenizer( br.readLine() );
		
		int n = Integer.parseInt(st.nextToken());
		st = new StringTokenizer( br.readLine() );
		Stack<Integer> in = new Stack<>();
		Stack<Integer> s = new Stack<>();
		Stack<Integer> an = new Stack<>();
		for(int i = 0; i < n; i++) {
			in.push(Integer.parseInt(st.nextToken()));
		}
		
		s.push(-1);
		for(int i = n-1; i >= 0; i--) {
			int a = in.pop();
			while(a >= s.peek() && s.peek() != -1) {
				s.pop();
			}
			an.push(s.peek());
			s.push(a);
		}
		
		for(int i = 0; i < n; i++) {
			bw.write(an.pop() + " ");
		}
		bw.flush();
		bw.close();
	}
}
