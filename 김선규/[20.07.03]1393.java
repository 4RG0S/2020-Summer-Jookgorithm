package Baekjoon.solve_01000;

import java.util.Scanner;

public class Baekjoon1393 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sx = sc.nextInt();
		int sy = sc.nextInt();
		int cx = sc.nextInt();
		int cy = sc.nextInt();
		int movex = sc.nextInt();
		int movey = sc.nextInt();
		int movemax = Math.max(movex, movey);
		int movemin = Math.min(movex, movey);
		while(movemin > 0) {	// 유클리드 호제법
			int tmp = movemax;
			movemax = movemin;
			movemin = tmp % movemin;
		}
		movex = movex / movemax;
		movey = movey / movemax;
		int minx = 10000;
		int miny = 10000;
		while(true) {
			if((sx - cx)*(sx - cx) + (sy - cy)*(sy - cy) >= (sx - minx)*(sx - minx) + (sy - miny)*(sy - miny)) {
				break;
			}else {
				minx = cx;
				miny = cy;
			}
			cx += movex;
			cy += movey;
		}
		System.out.print(minx + " " + miny);
	}
}
