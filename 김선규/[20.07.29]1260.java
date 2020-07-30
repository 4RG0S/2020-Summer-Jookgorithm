package Baekjoon.solve_01000;

import java.util.*;

public class Baekjoon1260 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int v = sc.nextInt();
		boolean[][] arr = new boolean[n + 1][n + 1];
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr[a][b] = arr[b][a] = true;
		}
		dfs(arr, v);
		System.out.println();
		bfs(arr, v);
	}

	public static void dfs(boolean[][] arr, int n) {
		boolean[] visit = new boolean[arr.length];
		Stack<Integer> st = new Stack<>();

		st.push(n);
		while (!st.isEmpty()) {
			int v = st.pop();
			if (!visit[v]) {
				System.out.print(v + " ");
				visit[v] = true;
				for (int i = arr[v].length - 1; i >= 0; i--) {
					if (arr[v][i] && !visit[i]) {
						st.push(i);
					}
				}
			}
		}
	}

	public static void bfs(boolean[][] arr, int n) {
		boolean[] visit = new boolean[arr.length];
		Queue<Integer> q = new LinkedList<>();

		q.offer(n);
		while (!q.isEmpty()) {
			int v = q.poll();
			if (!visit[v]) {
				System.out.print(v + " ");
				visit[v] = true;
				for (int i = 0; i < arr[v].length; i++) {
					if (arr[v][i] && !visit[i]) {
						q.offer(i);
					}
				}
			}
		}
	}
}
