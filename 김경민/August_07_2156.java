package August;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class August_07_2156 {
	static int result = Integer.MIN_VALUE;

	static class wine{
		int fir, se, th;
		int max;
		public wine(int fir)
		{
			this.fir = fir;
			max = fir;
			if(result < max)
				result = max;
		}
		public wine(int fir, int se)
		{
			this.fir = fir;
			this.se = se;
			this.max = Integer.max(fir, se);
			if(result < max)
				result = max;
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int num[] = new int[n];
		for(int i=0;i<n;i++)
		{
			num[i] = Integer.parseInt(br.readLine());
		}
		wine arr[] = new wine[n];
		arr[0] = new wine(num[0]);
		if(n > 1)
			arr[1] = new wine(num[1], arr[0].fir + num[1]);
		if(n > 2)
			arr[2] = new wine(arr[0].fir + num[2], arr[1].fir + num[2]);
		for(int i=3;i<n;i++)
		{
			arr[i] = new wine(Integer.max(arr[i-2].max, arr[i-3].max) + num[i], arr[i-1].fir + num[i]);
		}
		System.out.println(result);
	}

}
