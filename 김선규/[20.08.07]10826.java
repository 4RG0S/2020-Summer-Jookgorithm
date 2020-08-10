package Baekjoon.solve_10000;

import java.math.*;
import java.util.*;

public class Baekjoon10826 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		BigInteger a = BigInteger.ZERO;
		BigInteger b = BigInteger.ONE;
		BigInteger c = BigInteger.ZERO;
		for(int i = 1; i <= n; i++) {
			c = b.add(a);
			b = a;
			a = c;
		}
		
		System.out.print(a.toString());
	}
}
