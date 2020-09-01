package Baekjoon.solve_02000;

import java.io.*;
import java.util.*;

public class Baekjoon2751 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		Set<Integer> s = new TreeSet<>();
		while (n-- > 0) {
			s.add(Integer.parseInt(br.readLine()));
		}
		for (int m : s) {
			bw.write(m + "\n");
		}
		bw.flush();
		bw.close();
	}
}
