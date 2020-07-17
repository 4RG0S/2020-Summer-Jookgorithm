package July;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class July_16_7562 {
	
	static int dx[] = {1, 1, 2, 2, -1, -1, -2, -2};
	static int dy[] = {2, -2, 1, -1, 2, -2, 1, -1};
	static boolean isVisit[][];
	static int l;
	
	static class dot{
		int x, y, time;
		public dot(int x, int y)
		{
			this.x = x;
			this.y = y;
		}
		public dot(int x, int y, int time)
		{
			this.x = x;
			this.y = y;
			this.time = time;
		}
	}
	
	static void bfs(dot start, dot end)
	{
		Queue<dot> q = new LinkedList<>();
		int result = 0;
		q.add(new dot(start.x, start.y, 0));
		
		while(!q.isEmpty())
		{
			dot temp = q.poll();
			if(temp.x == end.x && temp.y == end.y)
			{
				result = temp.time;
				break;
			}
			for(int i=0;i<8;i++)
			{
				 int x = temp.x + dx[i];
				 int y = temp.y + dy[i];
				 if(0 <= x && x < l && 0 <= y && y < l && !isVisit[y][x])
				 {
					 isVisit[y][x] = true;
					 q.add(new dot(x, y, temp.time + 1));
				 }
			}
		}
		System.out.println(result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for(int i=0;i<T;i++)
		{
			l = scan.nextInt();
			isVisit = new boolean[l][l];
			dot start = new dot(scan.nextInt(), scan.nextInt());
			dot dest = new dot(scan.nextInt(), scan.nextInt());
			bfs(start, dest);
		}
	}

}
