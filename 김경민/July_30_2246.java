package July;

import java.util.Scanner;

public class July_30_2246 {

	static class condo{
		int distance, cost;
		public condo(int D, int C)
		{
			this.distance = D;
			this.cost = C;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int result = 0;
		condo arr[] = new condo[N];
		for(int i=0;i<N;i++)
		{
			arr[i] = new condo(scan.nextInt(), scan.nextInt());
		}
		for(int i=0;i<N;i++)
		{
			int D = arr[i].distance;
			int C = arr[i].cost;
			for(int j=0;j<N;j++)
			{
				if(arr[j].distance < D && arr[j].cost <= C)
					break;
				if(arr[j].cost < C && arr[j].distance <= D)
					break;
				if(j == N - 1)
					result++;
			}
		}
		System.out.println(result);
	}

}
