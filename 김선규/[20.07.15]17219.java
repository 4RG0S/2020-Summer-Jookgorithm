package Baekjoon.solve_15000;

import java.io.*;
import java.util.*;

public class Baekjoon17219 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		Map<String, String> map = new TreeMap<>();
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			map.put(st.nextToken(), st.nextToken());
		}
		for (int i = 0; i < n; i++) {
			System.out.println(map.get(br.readLine()));
		}
	}
}
