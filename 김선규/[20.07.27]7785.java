package Baekjoon.solve_05000;

import java.io.*;
import java.util.*;

public class Baekjoon7785 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		Map<String, Boolean> map = new TreeMap<>(Collections.reverseOrder());
		while(n-->0) {
			st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			String status = st.nextToken();
			if(status.equals("enter")) {
				map.put(name,true);
			}else {
				map.put(name, false);
			}
		}
		for(String s: map.keySet()) {
			if(map.get(s)) {
				System.out.println(s);
			}
		}
		
		bw.flush();
		bw.close();
	}
}
