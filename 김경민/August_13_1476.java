package August;

import java.util.Scanner;

public class August_13_1476 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int E = scan.nextInt();
		int S = scan.nextInt();
		int M = scan.nextInt();
		int year = 0;
		while(true)
		{
			int fir = year % 15 + 1;
			int se = year % 28 + 1;
			int th = year % 19 + 1;
			if(E == fir && S == se && M == th)
				break;
			year++;
		}
		System.out.println(year + 1);
	}

}
