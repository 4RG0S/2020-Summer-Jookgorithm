package July;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class July_09_14716 {
	
	static class dot{
		int x,y;
		public dot(int x, int y)
		{
			this.x = x;
			this.y = y;
		}
	}
	
	static int dx[] = {0, 0, 1, 1, 1, -1, -1, -1};
	static int dy[] = {1, -1, 0, 1, -1, 0, 1, -1};
	static char map[][];
	static boolean isVisit[][];
	static int result = 0;
	
	static void bfs(int x, int y)
	{
		Queue<dot> q = new LinkedList<>();
		q.add(new dot(x, y));
		isVisit[y][x] = true;
		while(!q.isEmpty())
		{
			dot temp = q.poll();
			for(int i=0;i<8;i++)
			{
				int tx = temp.x + dx[i];
				int ty = temp.y + dy[i];
				if(0 <= tx && tx < map[0].length && 0 <= ty && ty < map.length && map[ty][tx] == '1' && !isVisit[ty][tx])
				{
					isVisit[ty][tx] = true;
					q.add(new dot(tx, ty));
				}
			}
		}
		result++;
	}
	
	static void bfsAll() {
		for(int i=0;i<map.length;i++)
		{
			for(int j=0;j<map[0].length;j++)
			{
				if(map[i][j] == '1' && !isVisit[i][j])
				{
					bfs(j, i);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int M = scan.nextInt();
		int N = scan.nextInt();
		map = new char[M][N];
		isVisit = new boolean[M][N];
		scan.nextLine();
		for(int i=0;i<M;i++)
		{
			String line = scan.nextLine();
			for(int j=0;j<N;j++)
			{
				map[i][j] = line.charAt(j * 2);
			}
		}
		bfsAll();

		System.out.println(result);
	}

}
