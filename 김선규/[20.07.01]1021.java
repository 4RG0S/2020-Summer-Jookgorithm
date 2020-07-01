package Baekjoon.solve_01000;

import java.util.LinkedList;
import java.util.Scanner;

public class Baekjoon1021 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		LinkedList<Integer> list = new LinkedList<>();
		for(int i = 1; i <= n; i++)
			list.add(i);
		int p = 0;
		int move = 0;
		while(m-->0) {
			int num = sc.nextInt();
			if(list.get(p) < num) {
				int l = list.size() + p - list.indexOf(num);
				int r = list.indexOf(num) - p;
				p = list.indexOf(num);
				move += Math.min(l, r);
			}else {
				int l = p - list.indexOf(num);
				int r = list.size() + list.indexOf(num) - p;
				p = list.indexOf(num);
				move += Math.min(l, r);
			}
			list.remove(p);
			if(p == list.size())
				p = 0;
 		}
		System.out.print(move);
	}
}
