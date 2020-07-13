package Baekjoon.solve_02000;

import java.util.Scanner;

public class Baekjoon2748 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		long a1 = 0;
        long a2 = 1;
        long a3 = 1;
        
        for(int i=1; i<n; i++){
            a3=a1+a2;
            a1=a2;
            a2=a3;
        }
        System.out.print(a3);
	}
}
