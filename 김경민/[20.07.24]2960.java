package July;

import java.util.Scanner;

public class July_24_2960 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		boolean deleted[] = new boolean[N];
		int result = 0;
		int K = scan.nextInt();
		deleted[0] = true;
		while(K > 0)
		{
			int peek = 0;
			for(int i=1;i<N;i++)
			{
				if(!deleted[i])
				{
					deleted[i] = true;
					peek = i + 1;
					result = peek;
					K--;
					break;
				}
			}
			if(K > 0)
			{
				for(int k=peek;k<=N;k+=peek)
				{
					if(!deleted[k - 1] && K > 0)
					{
						deleted[k-1] = true;
						result = k;
						K--;
					}
				}
			}
		}
		System.out.println(result);
	}

}
