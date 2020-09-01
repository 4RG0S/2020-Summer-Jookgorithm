package July;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class July_23_6236 {
	
	static int val[];
	static int M;
	
	static boolean isOkay(long input) {
		int count = 1;
		long money = input;
		for(int i=0;i<val.length;i++)
		{
			if(input < val[i])
				return false;
			else {
				if(money >= val[i])
				{
					money -= val[i];
				}
				else
				{
					money = input;
					count++;
					money -= val[i];
				}
			}
		}
		//System.out.println(count);
		if(count <= M)
			return true;
		else
			return false;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String num = br.readLine();
		String split[] = num.split(" ");
		int N = Integer.parseInt(split[0]);
		M = Integer.parseInt(split[1]);
		val = new int[N];
		for(int i=0;i<N;i++)
		{
			val[i] = Integer.parseInt(br.readLine());
		}
		long start = 1;
		long end = Long.MAX_VALUE;
		long middle = (start + end) / 2;
		while(true)
		{
			if(isOkay(middle) && !isOkay(middle - 1))
			{
				break;
			}
			if(isOkay(middle))
			{
				end = middle;
				middle = (start + end) / 2;
			}
			else
			{
				start = middle;
				middle = (start + end) / 2;
			}
			//System.out.println(start + " " + middle + " " + end);
		}
		System.out.println(middle);
	}

}
