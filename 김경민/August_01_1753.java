package August;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class August_01_1753 {
	
	static List<List<path>> adj = new ArrayList<>();
	static int dist[];
	
	static class path implements Comparable<path>{
		int dest, val;
		public path(int dest, int val)
		{
			this.dest = dest;
			this.val = val;
		}
		@Override
		public int compareTo(path o) {
			return this.val - o.val;
		}
	}
	
	static void dijkstra(int src)
	{
		PriorityQueue<path> q = new PriorityQueue<>();
		dist = new int[adj.size()];
		for(int i=0;i<dist.length;i++)
		{
			dist[i] = Integer.MAX_VALUE;
		}
		q.add(new path(src, 0));
		dist[src] = 0;
		while(!q.isEmpty())
		{
			path temp = q.poll();
			if(dist[temp.dest] < temp.val)
				continue;
			for(int i=0;i<adj.get(temp.dest).size();i++)
			{
				if(dist[adj.get(temp.dest).get(i).dest] > temp.val + adj.get(temp.dest).get(i).val)
				{
					q.add(new path(adj.get(temp.dest).get(i).dest, temp.val + adj.get(temp.dest).get(i).val));
					dist[adj.get(temp.dest).get(i).dest] = temp.val + adj.get(temp.dest).get(i).val;
				}
			}
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer line = new StringTokenizer(br.readLine(), " ");
		int V = Integer.parseInt(line.nextToken());
		int E = Integer.parseInt(line.nextToken());
		int K = Integer.parseInt(br.readLine()) - 1;
		
		for(int i=0;i<V;i++)
		{
			adj.add(new ArrayList<>());
		}
		for(int i=0;i<E;i++)
		{
			line = new StringTokenizer(br.readLine(), " ");
			int from = Integer.parseInt(line.nextToken()) - 1;
			int to = Integer.parseInt(line.nextToken()) - 1;
			int val = Integer.parseInt(line.nextToken());
			
			adj.get(from).add(new path(to, val));
		}
		dijkstra(K);
		for(int i=0;i<dist.length;i++)
		{
			if(dist[i] == Integer.MAX_VALUE)
				System.out.println("INF");
			else
				System.out.println(dist[i]);
		}
	}

}
