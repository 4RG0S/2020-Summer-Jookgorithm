package Baekjoon.solve_02000;

import java.io.*;
import java.util.*;

public class Baekjoon2493 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		Stack<Integer> s1 = new Stack<>();
		Stack<Integer> s2 = new Stack<>();
		st = new StringTokenizer(br.readLine());

		s1.push(0);
		s2.push(0);
		for (int i = 1; i <= n; i++) {
			int a = Integer.parseInt(st.nextToken());
			while (a >= s2.peek() && s2.peek() != 0) {
				s1.pop();
				s2.pop();
			}
			bw.write(s1.peek() + " ");
			s1.push(i);
			s2.push(a);
		}
		
		bw.flush();
		bw.close();
	}
}
