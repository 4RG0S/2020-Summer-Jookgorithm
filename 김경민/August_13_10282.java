package August;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class August_13_10282 {
	
	static List<List<computer>> list;
	static int dist[];

	static class computer implements Comparable<computer>
	{
		int dependency, sec;
		public computer(int dependency, int sec)
		{
			this.dependency = dependency;
			this.sec = sec;
		}
		@Override
		public int compareTo(computer o) {
			return this.sec - o.sec;
		}
	}
	
	static void dijkstra(int from)
	{
		PriorityQueue<computer> q = new PriorityQueue<>();
		int count = 0;
		int max = Integer.MIN_VALUE;
		
		q.add(new computer(from, 0));
		dist[from] = 0;
		while(!q.isEmpty())
		{
			computer temp = q.poll();
			for(int i=0;i<list.get(temp.dependency).size();i++)
			{
				computer now = list.get(temp.dependency).get(i);
				if(dist[now.dependency] == -1 || dist[now.dependency] > temp.sec + now.sec)
				{
					dist[now.dependency] = temp.sec + now.sec;
					q.add(new computer(now.dependency, dist[now.dependency]));
				}
			}
		}
		for(int i=1;i<dist.length;i++)
		{
			if(dist[i] != -1)
				count++;
			if(max < dist[i])
				max = dist[i];
		}
		System.out.println(count + " " + max);
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer line = new StringTokenizer(br.readLine(), " ");
		int T = Integer.parseInt(line.nextToken());
		for(int i=0;i<T;i++)
		{
			line = new StringTokenizer(br.readLine(), " ");
			int n = Integer.parseInt(line.nextToken());
			int d = Integer.parseInt(line.nextToken());
			int c = Integer.parseInt(line.nextToken());

			list = new ArrayList<>();
			dist = new int[n+1];
			for(int j=0;j<n+1;j++)
			{
				list.add(new ArrayList<>());
				dist[j] = -1;
			}
			for(int j=0;j<d;j++)
			{
				line = new StringTokenizer(br.readLine(), " ");
				int from = Integer.parseInt(line.nextToken());
				int to = Integer.parseInt(line.nextToken());
				int sec = Integer.parseInt(line.nextToken());
				list.get(to).add(new computer(from, sec));
			}
			dijkstra(c);
		}
	}

}
