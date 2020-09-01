package August;

import java.util.Scanner;

public class August_20_2581 {
	
	static int sum = 0;
	static int min = Integer.MAX_VALUE;
	
	static void isPrime(int n)
	{
		if(n < 2)
			return;
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(n % i == 0)
				return;
		}
		sum += n;
		if(min > n)
			min = n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int M = scan.nextInt();
		int N = scan.nextInt();
		
		for(int i=M;i<=N;i++)
		{
			isPrime(i);
		}
		if(sum == 0)
			System.out.println(-1);
		else
		{
			System.out.println(sum);
			System.out.println(min);
		}
	}

}
