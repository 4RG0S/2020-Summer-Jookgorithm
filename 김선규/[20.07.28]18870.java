package Baekjoon.solve_15000;

import java.io.*;
import java.util.*;

public class Baekjoon18870 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), i;
		List<Integer> list = new ArrayList<>();
		Map<Integer, Integer> map = new TreeMap<>();
		st = new StringTokenizer(br.readLine());
		for(i = 0; i < n; i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		for(i = 0; i < n; i++) {
			map.put(list.get(i), -1);
		}
		i = 0;
		for(int num : map.keySet()) {
			map.put(num, i++);
		}
		for(i = 0; i < n; i++) {
			bw.write(map.get(list.get(i)) + " ");;
		}

		bw.flush();
		bw.close();
	}
}
