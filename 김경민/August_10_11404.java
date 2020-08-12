package August;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class August_10_11404 {
	
	static class bus implements Comparable<bus>{
		int dest, len;
		
		public bus(int dest, int len)
		{
			this.dest = dest;
			this.len = len;
		}
		@Override
		public int compareTo(bus o) {
			return this.len - o.len;
		}
	}
	
	static int dist[];
	static List<List<bus>> list = new ArrayList<>();
	
	static void dijkstra(int from)
	{
		PriorityQueue<bus> q = new PriorityQueue<>();
		q.add(new bus(from, 0));
		dist[from] = 0;
		while(!q.isEmpty())
		{
			bus temp = q.poll();
			for(int i=0;i<list.get(temp.dest).size();i++)
			{
				bus now = list.get(temp.dest).get(i);
				if(dist[now.dest] == -1 || dist[now.dest] > now.len + temp.len)
				{
					dist[now.dest] = temp.len + now.len;
					q.add(new bus(now.dest, temp.len + now.len));
				}
			}
		}
		for(int i=1;i<dist.length;i++)
		{
			if(dist[i] != -1)
				System.out.print(dist[i] + " ");
			else
				System.out.print(0 + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer line = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(line.nextToken());
		line = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(line.nextToken());
		for(int i=0;i<n+1;i++)
			list.add(new ArrayList<>());
		for(int i=0;i<m;i++)
		{
			line = new StringTokenizer(br.readLine(), " ");
			int from = Integer.parseInt(line.nextToken());
			int to = Integer.parseInt(line.nextToken());
			int len = Integer.parseInt(line.nextToken());
			list.get(from).add(new bus(to, len));
		}
		for(int i=1;i<=n;i++)
		{
			dist = new int[n+1];
			for(int j=0;j<n+1;j++)
				dist[j] = -1;
			dijkstra(i);
		}
	}

}
