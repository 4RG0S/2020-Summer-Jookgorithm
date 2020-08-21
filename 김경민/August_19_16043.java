package August;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class August_19_16043 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String split[] = line.split(" ");
		int n = Integer.parseInt(split[0]);
		int m = Integer.parseInt(split[1]);
		
		int arr[] = new int[n];
		boolean isUsed[] = new boolean[n+2];
		for(int i=0;i<m;i++)
		{
			int input = Integer.parseInt(br.readLine());
			arr[i] = input;
			isUsed[input] = true;
		}
		int index = 0;
		int remain = 1;
		for(int i=1;i<=n;i++)
		{
			int temp = remain;
			while(isUsed[temp])
				temp++;
			if(arr[index] > temp || arr[index] == 0)
			{
				System.out.println(temp);
				remain = temp;
				isUsed[temp] = true;
			}
			else
			{
				System.out.println(arr[index]);
				remain = temp;
				index++;
			}
		}
		
	}

}
