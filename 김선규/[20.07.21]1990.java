package Baekjoon.solve_01000;

import java.io.*;
import java.util.*;

public class Baekjoon1990 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		boolean[] arr = new boolean[b+1];
		arr[1] = true;
		for (int i = 2; i * i <= b; i++) {
			if(arr[i])continue;
			for (int j = i * i; j <= b; j += i) {
				arr[j] = true;
			}
		}
		for(int i = a; i <= b; i++) {
			if(!arr[i] && func(Integer.toString(i))) {
				bw.write(i + "\n");;
			}
		}
		bw.write("-1");
		bw.flush();
		bw.close();
	}
	
	public static boolean func(String s) {
		boolean pal = true;
		int left = 0;
		int right = s.length()-1;
		while(left < right && pal) {
			if(s.charAt(left) != s.charAt(right)) {
				pal = false;
			}
			left++;
			right--;
		}
		return pal;
	}
}
