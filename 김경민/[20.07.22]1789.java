package July;

import java.util.Scanner;
import java.util.Stack;

public class July_22_1789 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		long S = scan.nextLong();
		long n = 1;
		while(n*(n+1)/2 <= S)
		{
			n++;
		}
		System.out.println(n-1);
	}

}
