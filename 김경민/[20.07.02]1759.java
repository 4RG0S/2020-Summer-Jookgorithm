package July;

import java.util.Arrays;
import java.util.Scanner;

public class July_02_1759 {
	
	static char ar[];
	
	public static boolean valid(String test)
	{
		int a_count = 0;
		int b_count = 0;
		for(int i=0;i<test.length();i++)
		{
			char temp = test.charAt(i);
			if(temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u')
				a_count++;
			else
				b_count++;
		}
		if(a_count >= 1 && b_count >= 2)
			return true;
		else
			return false;
	}
	
	public static void track(int N, StringBuffer result, int from, int to)
	{
		if(N == 0)
		{
			if(valid(result.toString()))
				System.out.println(result.toString());
		}
		else
		{
			for(int i=from;i<to;i++)
			{
				track(N - 1, result.append(ar[i]), i + 1, to);
				result.deleteCharAt(result.length() - 1);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int L = scan.nextInt();
		int C = scan.nextInt();
		ar = new char[C];
		scan.nextLine();
		String line = scan.nextLine();
		String split[] = line.split(" ");
		for(int i=0;i<split.length;i++)
		{
			ar[i] = split[i].charAt(0);
		}
		Arrays.sort(ar);
		track(L, new StringBuffer(""), 0, C);
	}

}
