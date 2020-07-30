package July;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class July_28_4948 {
	
	static boolean isPrime(int n)
	{
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			int input = Integer.parseInt(br.readLine());
			int count = 0;
			if(input == 0)
				break;
			for(int i=input+1;i<=input*2;i++)
			{
				if(isPrime(i))
					count++;
			}
			System.out.println(count);
		}
	}

}
