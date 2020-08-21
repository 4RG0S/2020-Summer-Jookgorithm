package July;

import java.util.HashSet;
import java.util.Scanner;

public class July_03_10529 {
	
	static int result = 0;
	static boolean isUsed[] = new boolean[10];
	static int num[];
	static Character ar[];
	static String line[];
	
	public static void track(int count) {
		if(count == 0)
		{
			/*
			for(int i=0;i<num.length;i++)
			{
				System.out.print(num[i] + " ");
			}
			System.out.println();
			*/
			check();
		}
		else
		{
			for(int i=0;i<10;i++)
			{
				if(!isUsed[i])
				{
					num[count - 1] = i;
					isUsed[i] = true;
					track(count - 1);
					isUsed[i] = false;
				}
			}
		}
	}
	
	public static void check() {
		int sum = 0;
		for(int i=0;i<line.length-1;i++)
		{
			int count = 0;
			String temp = line[i];
			for(int k=0;k<temp.length();k++)
			{
				char t = temp.charAt(k);
				for(int j=0;j<ar.length;j++)
				{
					if(ar[j] == t)
					{
						if(k == 0 && num[j] == 0)
							return;
						else
							count = count * 10 + num[j];
					}
				}
			}
			sum += count;
		}
		int count = 0;
		String temp = line[line.length - 1];
		for(int k=0;k<temp.length();k++)
		{
			char t = temp.charAt(k);
			for(int j=0;j<ar.length;j++)
			{
				if(ar[j] == t)
				{
					if(k == 0 && num[j] == 0)
						return;
					else
						count = count * 10 + num[j];
				}
			}
		}
		if(count == sum)
			result++;
		//System.out.println(sum + " " + count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		HashSet<Character> set = new HashSet<>();
		
		int n = scan.nextInt();
		line = new String[n];
		scan.nextLine();
		for(int i=0;i<n;i++)
		{
			line[i] = scan.nextLine();
			for(char temp : line[i].toCharArray())
			{
				if(!set.contains(temp))
					set.add(temp);
			}
		}
		ar = new Character[set.size()];
		num = new int[set.size()];
		ar = set.toArray(ar);
		track(set.size());
		System.out.println(result);
		
	}

}
