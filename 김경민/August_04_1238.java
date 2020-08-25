package August;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class August_04_1238 {
	
	static List<List<path>> list = new ArrayList<>();
	static int X;
	static int dist[];
	
	static class path implements Comparable<path>{
		int dest, len;
		public path(int dest, int len)
		{
			this.dest = dest;
			this.len = len;
		}
		@Override
		public int compareTo(path o) {
			return this.len - o.len;
		}
	}
	
	static void dijkstra() {
		PriorityQueue<path> q = new PriorityQueue<>();
		int max = Integer.MIN_VALUE;
		for(int i=1;i<list.size();i++)
		{
			if(i == X)
				continue;
			dist = new int[list.size()];
			q.add(new path(i, 0));
			while(!q.isEmpty())
			{
				path temp = q.poll();
				for(int j=0;j<list.get(temp.dest).size();j++)
				{
					path now = list.get(temp.dest).get(j);
					if(dist[now.dest] == 0 || dist[now.dest] > now.len + temp.len)
					{
						dist[now.dest] = now.len + temp.len;
						q.add(new path(now.dest, dist[now.dest]));
					}
				}
			}
			
			q.add(new path(X, dist[X]));
			dist = new int[list.size()];
			while(!q.isEmpty())
			{
				path temp = q.poll();
				for(int j=0;j<list.get(temp.dest).size();j++)
				{
					path now = list.get(temp.dest).get(j);
					if(dist[now.dest] == 0 || dist[now.dest] > now.len + temp.len)
					{
						dist[now.dest] = now.len + temp.len;
						q.add(new path(now.dest, dist[now.dest]));
					}
				}
			}
			//System.out.println(dist[i]);
			if(dist[i] > max)
				max = dist[i];
		}
		System.out.println(max);
		
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer num = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(num.nextToken());
		int M = Integer.parseInt(num.nextToken());
		X = Integer.parseInt(num.nextToken());
		
		for(int i=0;i<N+1;i++)
			list.add(new ArrayList<>());
		for(int i=0;i<M;i++)
		{
			StringTokenizer line = new StringTokenizer(br.readLine(), " ");
			list.get(Integer.parseInt(line.nextToken())).add(new path(Integer.parseInt(line.nextToken()), Integer.parseInt(line.nextToken())));
		}
		dijkstra();
		
	}

}
