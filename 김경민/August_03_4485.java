package August;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class August_03_4485 {
	
	static int val[][];
	static int dist[];
	static int min;
	static int N;
	static int dx[] = {1, -1, 0, 0};
	static int dy[] = {0, 0, 1, -1};
	
	static class zelda implements Comparable<zelda>{
		int x, y, val;
		public zelda(int x, int y, int val)
		{
			this.x = x;
			this.y = y;
			this.val = val;
		}
		@Override
		public int compareTo(zelda o) {
			return this.val - o.val;
		}
	}
	
	static void dijkstra() {
		PriorityQueue<zelda> q = new PriorityQueue<>();
		q.add(new zelda(0, 0, val[0][0]));
		dist[0] = val[0][0];
		min = Integer.MAX_VALUE;
		while(!q.isEmpty())
		{
			zelda temp = q.poll();
			if(temp.x == N-1 && temp.y == N-1 && min > temp.val)
				min = temp.val;
			for(int i=0;i<4;i++)
			{
				int x = temp.x + dx[i];
				int y = temp.y + dy[i];
				if(0 <= x && x < N && 0 <= y && y < N)
				{
					if(dist[y*N+x] == -1)
					{
						dist[y*N+x] = temp.val + val[y][x];
						q.add(new zelda(x, y, temp.val + val[y][x]));
					}
					else if(dist[y*N+x] > temp.val + val[y][x])
					{
						dist[y*N+x] = temp.val + val[y][x];
						q.add(new zelda(x, y, temp.val + val[y][x]));
					}
				}
			}
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = 1;
		while(true)
		{
			N = Integer.parseInt(br.readLine());
			if(N == 0)
				break;
			val = new int[N][N];
			dist = new int[N*N];
			for(int i=0;i<N*N;i++)
			{
				dist[i] = -1;
			}
			for(int i=0;i<N;i++)
			{
				StringTokenizer token = new StringTokenizer(br.readLine(), " ");
				for(int j=0;j<N;j++)
				{
					val[i][j] = Integer.parseInt(token.nextToken());
				}
			}
			dijkstra();
			System.out.println("Problem " + count + ": " + min);
			count++;
		}
	}

}
