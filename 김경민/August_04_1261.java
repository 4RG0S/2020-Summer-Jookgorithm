package August;

import java.util.PriorityQueue;
import java.util.Scanner;

public class August_04_1261 {
	
	static int map[][];
	static int dist[][];
	static int dx[] = {0, 0, 1, -1};
	static int dy[] = {1, -1, 0, 0};
	
	static class maze implements Comparable<maze>{
		int x,y,count;
		public maze(int x, int y, int count)
		{
			this.x = x;
			this.y = y;
			this.count = count;
		}
		@Override
		public int compareTo(maze o) {
			return this.count - o.count;
		}
	}
	
	static void dijkstra() {
		PriorityQueue<maze> q = new PriorityQueue<>();
		q.add(new maze(0, 0, 0));
		dist[0][0] = 0;
		while(!q.isEmpty())
		{
			maze temp = q.poll();
			for(int i=0;i<4;i++)
			{
				int x = temp.x + dx[i];
				int y = temp.y + dy[i];
				if(0 <= x && x < map[0].length && 0 <= y && y < map.length)
				{
					if(map[y][x] == 1)
					{
						if(dist[y][x] > temp.count + 1)
						{
							dist[y][x] = temp.count + 1;
							q.add(new maze(x, y, temp.count + 1));
						}
					}
					else if(map[y][x] == 0)
					{
						if(dist[y][x] > temp.count)
						{
							dist[y][x] = temp.count;
							q.add(new maze(x, y, temp.count));
						}
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int M = scan.nextInt();
		int N = scan.nextInt();
		scan.nextLine();
		map = new int[N][M];
		dist = new int[N][M];
		for(int i=0;i<N;i++)
		{
			String line = scan.nextLine();
			for(int j=0;j<M;j++)
			{
				map[i][j] = line.charAt(j) - '0';
				dist[i][j] = Integer.MAX_VALUE;
			}
		}
		dijkstra();
		System.out.println(dist[N-1][M-1]);
	}

}
