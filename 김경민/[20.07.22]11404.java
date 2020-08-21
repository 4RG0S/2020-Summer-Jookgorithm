package July;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class July_22_11404 {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	static int N;
	static long value[][];
	static boolean isVisit[];
	static long min[][];
	static int weight;
	
	static void dfs(int start, int here) throws IOException {
		//bw.write(start + " " + here + " " + weight);
		if(min[start][here] == 0)
			min[start][here] = weight;
		else if(min[start][here] > weight)
			min[start][here] = weight;
		for(int i=0;i<N;i++)
		{
			if(value[here][i] != 0 && !isVisit[i])
			{
				weight += value[here][i];
				isVisit[i] = true;
				dfs(start, i);
				isVisit[i] = false;
				weight -= value[here][i];
			}
		}
	}
	
	static void dfsAll() throws IOException {
		for(int i=0;i<N;i++)
		{
			isVisit = new boolean[N];
			weight = 0;
			dfs(i, i);
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		
		N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		value = new long[N][N];
		min = new long[N][N];
		for(int i=0;i<M;i++)
		{
			StringTokenizer token = new StringTokenizer(br.readLine());
			int from = Integer.parseInt(token.nextToken());
			int to = Integer.parseInt(token.nextToken());
			int val = Integer.parseInt(token.nextToken());
			if(value[from - 1][to - 1] == 0)
				value[from - 1][to - 1] = val;
			else
			{
				if(value[from - 1][to - 1] > val)
					value[from - 1][to - 1] = val;
			}
		}
		dfsAll();
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++)
			{
				if(i != j)
					bw.write(min[i][j] + " ");
				else
					bw.write(0 + " ");
			}
			bw.write('\n');
		}
		bw.flush();
	}

}