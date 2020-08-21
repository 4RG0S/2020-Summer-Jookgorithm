package August;

import java.math.BigInteger;
import java.util.Scanner;

public class August_21_2748 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		BigInteger arr[] = new BigInteger[91];
		
		arr[0] = new BigInteger("0");
		arr[1] = new BigInteger("1");
		for(int i=2;i<91;i++)
		{
			arr[i] = new BigInteger("0").add(arr[i-1]).add(arr[i-2]);
		}
		System.out.println(arr[n].toString());
	}

}
