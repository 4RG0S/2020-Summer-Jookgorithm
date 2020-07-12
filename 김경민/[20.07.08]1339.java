package July;

import java.util.HashSet;
import java.util.Scanner;

public class July_08_1339 {
	
	static int max = Integer.MIN_VALUE;
	static int arr[];
	static boolean isUsed[] = new boolean[10];
	static Character ar[];
	static String line[];
	
	public static void track(int count) {
		if(count == arr.length)
		{
			calculate();
		}
		else
		{
			for(int i=0;i<10;i++)
			{
				if(!isUsed[i] && arr[count] == -1)
				{
					isUsed[i] = true;
					arr[count] = i;
					track(count + 1);
					arr[count] = -1;
					isUsed[i] = false;
				}
			}
		}
	}
	
	public static void calculate() {
		int sum = 0;
		for(int i=0;i<line.length;i++)
		{
			int temp = 0;
			for(char ch:line[i].toCharArray())
			{
				for(int j=0;j<ar.length;j++)
				{
					if(ch == ar[j])
					{
						temp = temp * 10 + arr[j];
					}
				}
			}
			sum += temp;
		}
		if(sum > max)
			max = sum;
		//System.out.println("done");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		HashSet<Character> set = new HashSet<>();
		int N = scan.nextInt();
		scan.nextLine();
		line = new String[N];
		for(int i=0;i<N;i++)
		{
			line[i] = scan.nextLine();
			for(char temp:line[i].toCharArray())
			{
				if(!set.contains(temp))
					set.add(temp);
			}
		}
		ar = new Character[set.size()];
		ar = set.toArray(ar);
		arr = new int[set.size()];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = -1;
		}
		track(0);
		System.out.println(max);
	}

}
