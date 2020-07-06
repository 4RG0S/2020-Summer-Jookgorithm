package Baekjoon.solve_01000;

import java.util.*;

public class Baekjoon1158 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		Queue<Integer> q = new LinkedList<>();
		for(int i = 1; i <= n; i++)
			q.offer(i);
		
		System.out.print("<");
		while(!q.isEmpty()) {
			for(int i = 1; i < k; i++) {
				q.offer(q.poll());
			}
			if(q.size() != 1)
				System.out.print(q.poll() + ", ");
			else
				System.out.print(q.poll());
		}
		System.out.print(">");
	}
}
