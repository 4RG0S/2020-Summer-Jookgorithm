package Baekjoon.solve_10000;

import java.util.*;

public class Baekjoon11866 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		Queue<Integer> qu = new LinkedList<>();
		for(int i = 1 ; i <= n; i++) {
			qu.offer(i);
		}
		
		System.out.print("<");
		while(!qu.isEmpty()) {
			for(int i = 1; i < k; i++) {
				qu.offer(qu.poll());
			}
			if(qu.size() == 1) {
				System.out.print(qu.poll() + ">");
			}else {
				System.out.print(qu.poll() + ", ");
			}
		}
	}
}
