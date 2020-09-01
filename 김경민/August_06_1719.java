package August;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class August_06_1719 {
	
	static dist val[];
	static List<List<node>> list = new ArrayList<>();
	
	static class dist{
		int val, fir;
		public dist(int val)
		{
			this.val = val;
		}
	}
	static class node implements Comparable<node>{
		int dest, len, fir;
		public node(int dest, int len, int fir)
		{
			this.dest = dest;
			this.len = len;
			this.fir = fir;
		}
		@Override
		public int compareTo(node o) {
			return this.len - o.len;
		}
	}
	
	static void dijkstra(int from)
	{
		PriorityQueue<node> q = new PriorityQueue<>();
		for(int i=0;i<list.size();i++)
			val[i] = new dist(-1);
		val[from].val = 0;
		q.add(new node(from, 0, 0));
		while(!q.isEmpty())
		{
			node temp = q.poll();
			for(int i=0;i<list.get(temp.dest).size();i++)
			{
				node now = list.get(temp.dest).get(i);
				if(val[now.dest].val == -1 || val[now.dest].val > now.len + temp.len)
				{
					if(val[now.dest].fir == 0 && temp.fir == 0)
						val[now.dest].fir = now.dest;
					else
						val[now.dest].fir = temp.fir;
					val[now.dest].val = now.len + temp.len;
					q.add(new node(now.dest, now.len + temp.len, val[now.dest].fir));
				}
			}
		}
		for(int i=1;i<list.size();i++)
		{
			if(val[i].val == 0 || val[i].val == -1)
				System.out.print("- ");
			else
				System.out.print(val[i].fir + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer line = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(line.nextToken());
		int m = Integer.parseInt(line.nextToken());
		val = new dist[n+1];
		for(int i=0;i<n+1;i++)
		{
			list.add(new ArrayList<>());
		}
		for(int i=0;i<m;i++)
		{
			line = new StringTokenizer(br.readLine(), " ");
			int from = Integer.parseInt(line.nextToken());
			int to = Integer.parseInt(line.nextToken());
			int len = Integer.parseInt(line.nextToken());
			
			list.get(from).add(new node(to, len, 0));
			list.get(to).add(new node(from, len, 0));
		}
		for(int i=1;i<=n;i++)
		{
			dijkstra(i);
		}
	}

}
