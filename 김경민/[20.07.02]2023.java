package July;

import java.util.Scanner;

public class July_02_2023 {
	
	public static boolean isPrime(int n)
	{
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(n % i == 0)
				return false;
		}
		return true;
	}
	
	public static void track(int N, int save)
	{
		if(N == 0)
			System.out.println(save);
		else
		{
			for(int i=0;i<=9;i++)
			{
				if(isPrime(save * 10 + i))
					track(N - 1, save * 10 + i);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		track(N - 1, 2);
		track(N - 1, 3);
		track(N - 1, 5);
		track(N - 1, 7);
		
		
	}

}
