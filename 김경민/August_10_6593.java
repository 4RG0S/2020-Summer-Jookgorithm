package August;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class August_10_6593 {

	static int dx[] = {1, -1, 0, 0, 0, 0};
	static int dy[] = {0, 0, 1, -1, 0, 0};
	static int dz[] = {0, 0, 0, 0, 1, -1};
	static char map[][][];
	static int dist[][][];
	
	static class floor implements Comparable<floor>
	{
		int x,y,z,len;
		public floor(int x,int y, int z, int len)
		{
			this.x = x;
			this.y = y;
			this.z = z;
			this.len = len;
		}
		@Override
		public int compareTo(floor o) {
			return this.len - o.len;
		}
	}
	
	static void dijkstra(floor start, floor end)
	{
		PriorityQueue<floor> q = new PriorityQueue<>();
		q.add(new floor(start.x, start.y, start.z, 0));
		dist[start.z][start.y][start.x] = 0;
		while(!q.isEmpty())
		{
			floor temp = q.poll();
			for(int i=0;i<6;i++)
			{
				int x = temp.x + dx[i];
				int y = temp.y + dy[i];
				int z = temp.z + dz[i];
				if(0 <= x && x < dist[0][0].length && 0 <= y && y < dist[0].length && 0 <= z && z < dist.length)
				{
					if(map[z][y][x] == '.')
					{
						if(dist[z][y][x] == -1 || dist[z][y][x] > temp.len + 1)
						{
							dist[z][y][x] = temp.len + 1;
							q.add(new floor(x, y, z, temp.len + 1));
						}
					}
				}
			}
		}
		if(dist[end.z][end.y][end.x] == -1)
			System.out.println("Trapped!");
		else
			System.out.println("Escaped in " + dist[end.z][end.y][end.x] + " minute(s).");
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			StringTokenizer line = new StringTokenizer(br.readLine(), " ");
			int L = Integer.parseInt(line.nextToken());
			int R = Integer.parseInt(line.nextToken());
			int C = Integer.parseInt(line.nextToken());
			map = new char[L][R][C];
			dist = new int[L][R][C];
			floor start = null, end = null;
			if(L == 0)
				break;
			for(int i=0;i<L;i++)
			{
				for(int j=0;j<R;j++)
				{
					String input = br.readLine();
					for(int k=0;k<C;k++)
					{
						map[i][j][k] = input.charAt(k);
						if(map[i][j][k] == 'S')
						{
							start = new floor(k, j, i, 0);
							map[i][j][k] = '.';
						}
						if(map[i][j][k] == 'E')
						{
							end = new floor(k, j, i, 0);
							map[i][j][k] = '.';
						}
						dist[i][j][k] = -1;
					}
				}
				br.readLine();
			}
			dijkstra(start, end);
		}
		
	}

}
