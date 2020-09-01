package July;

import java.math.BigInteger;
import java.util.Scanner;

public class July_10_2731 {
	
	static String input;
	static BigInteger result;
	static StringBuffer re;
	
	static void track(int len) {
		if(len == 0)
			System.out.println(result);
		else {
			if(len == input.length())
			{
				for(int i=0;i<10;i++)
				{
					if((int)Math.pow(i, 3) % 10 == input.charAt(len - 1) - '0')
					{
						result = BigInteger.valueOf(i);
						re.insert(0, i);
						track(len - 1);
					}
				}
			}
			else
			{
				for(int i=0;i<10;i++)
				{
					BigInteger temp = new BigInteger(i + re.toString());
					//System.out.println(temp);
					int digit = input.length() - (len - 1);
					String ori = temp.multiply(temp.multiply(temp)).remainder(BigInteger.valueOf((long)Math.pow(10, digit))).toString();
					String tp = Long.toString(Long.parseLong(input.substring(len - 1, input.length())));
					if(ori.equals(tp))
					{
						result = temp;
						re.insert(0, i);
						//System.out.println(re);
						track(len - 1);
						re.deleteCharAt(0);
						result = result.remainder(BigInteger.valueOf((long)Math.pow(10, input.length() - len)));
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		scan.nextLine();
		for(int i=0;i<T;i++)
		{
			re = new StringBuffer();
			input = scan.nextLine();
			track(input.length());
		}
	}

}
