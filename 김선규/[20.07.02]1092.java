package Baekjoon.solve_01000;

import java.util.*;

public class Baekjoon1092 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		ArrayList<Integer> crain = new ArrayList<Integer>();
		for(int i = 0; i < n; i++)
			crain.add(sc.nextInt());
		Collections.sort(crain);
		Collections.reverse(crain);
		
		int m = sc.nextInt();
		ArrayList<Integer> box = new ArrayList<Integer>();
		for(int i = 0; i < m; i++)
			box.add(sc.nextInt());
		Collections.sort(box);
		Collections.reverse(box);
		
		if(crain.get(0) < box.get(0)) {
			System.out.print(-1);
			System.exit(0);
		}
		
		int time = 0;
		while(!box.isEmpty()) {
			int i = 0;
			for(int j = 0; j < box.size(); j++) {
				if(crain.get(i) >= box.get(j)) {
					box.remove(j);
					j--;
					i++;
				}
				if(i == n)
					break;
			}
			time++;
		}
		System.out.print(time);
	}
}
