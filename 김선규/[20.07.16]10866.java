package Baekjoon.solve_10000;

import java.io.*;
import java.util.*;

public class Baekjoon10866 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		LinkedList<Integer> list = new LinkedList<>();
		while (n-- > 0) {
			st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			switch (s) {
			case "push_front":
				list.addFirst(Integer.parseInt(st.nextToken()));
				break;
			case "push_back":
				list.addLast(Integer.parseInt(st.nextToken()));
				break;
			case "pop_front":
				if (list.size() == 0) {
					bw.write("-1\n");
				} else {
					bw.write(list.removeFirst() + "\n");
				}
				break;
			case "pop_back":
				if (list.size() == 0) {
					bw.write("-1\n");
				} else {
					bw.write(list.removeLast() + "\n");
				}
				break;
			case "size":
				bw.write(list.size() + "\n");
				break;
			case "empty":
				if (list.size() == 0) {
					bw.write("1\n");
				} else {
					bw.write("0\n");
				}
				break;
			case "front":
				if (list.size() == 0) {
					bw.write("-1\n");
				} else {
					bw.write(list.getFirst() + "\n");
				}
				break;
			case "back":
				if (list.size() == 0) {
					bw.write("-1\n");
				} else {
					bw.write(list.getLast() + "\n");
				}
				break;
			}
		}
		bw.flush();
		bw.close();
	}
}
