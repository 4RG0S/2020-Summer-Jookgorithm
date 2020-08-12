package August;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class August_05_5719 {
	
	static List<List<path>> list;
	static int dist[];
	
	static class pair{
		int from, index;
		public pair(int from, int index)
		{
			this.from = from;
			this.index = index;
		}
	}
	static class path implements Comparable<path>{
		int dest, len;
		List<pair> memo = new ArrayList<>();
		boolean isShortest;
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
	
	static void dijkstra(int from, int to)
	{
		int min = Integer.MAX_VALUE;
		PriorityQueue<path> q = new PriorityQueue<>();
		q.add(new path(from, 0));
		dist[from] = 0;
		while(!q.isEmpty())
		{
			path temp = q.poll();
			for(int i=0;i<list.get(temp.dest).size();i++)
			{
				path now = list.get(temp.dest).get(i);
				if(dist[now.dest] == -1 || dist[now.dest] > now.len + temp.len)
				{
					dist[now.dest] = now.len + temp.len;
					q.add(new path(now.dest, now.len + temp.len));
				}
			}
		}
		if(min > dist[to])
			min = dist[to];
		if(min == -1)
		{
			System.out.println(-1);
			return;
		}
		for(int i=0;i<dist.length;i++)
			dist[i] = -1;
		//최소거리 노드 체크
		q.add(new path(from, 0));
		dist[from] = 0;
		while(!q.isEmpty())
		{
			path temp = q.poll();
			if(temp.dest == to && temp.len == min)
			{
				for(int i=0;i<temp.memo.size();i++)
				{
					list.get(temp.memo.get(i).from).get(temp.memo.get(i).index).isShortest = true;
				}
			}
			for(int i=0;i<list.get(temp.dest).size();i++)
			{
				path now = list.get(temp.dest).get(i);
				if(dist[now.dest] == -1 || dist[now.dest] >= now.len + temp.len)
				{
					dist[now.dest] = now.len + temp.len;
					path add = new path(now.dest, now.len + temp.len);
					for(int j=0;j<temp.memo.size();j++)
					{
						add.memo.add(new pair(temp.memo.get(j).from, temp.memo.get(j).index));
					}
					add.memo.add(new pair(temp.dest, i));
					q.add(add);
				}
			}
		}
		/*
		for(int i=0;i<list.size();i++)
		{
			for(int j=0;j<list.get(i).size();j++)
				System.out.println(list.get(i).get(j).isShortest);
		}
		*/
		for(int i=0;i<dist.length;i++)
			dist[i] = -1;
		q.add(new path(from, 0));
		dist[from] = 0;
		while(!q.isEmpty())
		{
			path temp = q.poll();
			for(int i=0;i<list.get(temp.dest).size();i++)
			{
				path now = list.get(temp.dest).get(i);
				if((dist[now.dest] == -1 || dist[now.dest] > now.len + temp.len) && !now.isShortest)
				{
					dist[now.dest] = now.len + temp.len;
					q.add(new path(now.dest, now.len + temp.len));
				}
			}
		}
		System.out.println(dist[to]);
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			list = new ArrayList<>();
			StringTokenizer line = new StringTokenizer(br.readLine(), " ");
			int N = Integer.parseInt(line.nextToken());
			int M = Integer.parseInt(line.nextToken());
			if(N == 0 && M == 0)
				break;
			line = new StringTokenizer(br.readLine(), " ");
			int S = Integer.parseInt(line.nextToken());
			int D = Integer.parseInt(line.nextToken());
			
			dist = new int[N];
			for(int i=0;i<N;i++)
			{
				list.add(new ArrayList<>());
				dist[i] = -1;
			}
			for(int i=0;i<M;i++)
			{
				line = new StringTokenizer(br.readLine(), " ");
				list.get(Integer.parseInt(line.nextToken())).add(new path(Integer.parseInt(line.nextToken()), Integer.parseInt(line.nextToken())));
			}
			dijkstra(S, D);
		}
		
		
	}

}
