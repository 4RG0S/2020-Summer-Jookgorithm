package July;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class July_26_2934 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr[] = new int[100001];
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0;i<N;i++)
		{
			String line = br.readLine();
			String split[] = line.split(" ");
			int from = Integer.parseInt(split[0]);
			int to = Integer.parseInt(split[1]);
			System.out.println(arr[from] + arr[to]);
			arr[from] = 0;
			arr[to] = 0;
			for(int j=from+1;j<to;j++)
			{
				arr[j]++;
			}
		}
	}

}
