package July;

import java.util.Scanner;

public class July_14_3474 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for(int i=0;i<T;i++)
		{
			int input = scan.nextInt();
			int count = 0;
			while(input > 0)
			{
				count += input / 5;
				input /= 5;
			}
			System.out.println(count);
		}
	}

}
