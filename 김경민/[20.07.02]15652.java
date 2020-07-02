package July;

import java.util.Scanner;

public class July_02_15652 {
	
	static void track(String picked, int last, int from, int to)
	{
		if(last == 0)
			System.out.println(picked);
		else
		{
			for(int i=from;i<to;i++)
			{
				track(picked+ i + " ", last - 1, i, to);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		track("", M, 1, N + 1);
	}

}
