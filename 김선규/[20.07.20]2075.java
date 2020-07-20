package Baekjoon.solve_02000;

import java.io.*;
import java.util.*;

public class Baekjoon2075 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		Set<Integer> set = new TreeSet<>();
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
				set.add(Integer.parseInt(st.nextToken()));
			}
		}
		int num = 0;
		for(int i: set) {
			if(set.size() == n++) {
				num = i;
				break;
			}
		}
		System.out.print(num);
	}
}
