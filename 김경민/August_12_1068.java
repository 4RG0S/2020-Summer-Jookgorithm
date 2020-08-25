package August;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class August_12_1068 {
	
	static class Node{
		int parent;
		List<Integer> children = new ArrayList<>();
		public Node(int parent)
		{
			this.parent = parent;
		}
	}
	
	static int result = 0;
	static Node arr[];
	
	static void count(Node root) {
		if(root.children.size() == 0)
			result++;
		else
		{
			for(int i=0;i<root.children.size();i++)
			{
				count(arr[root.children.get(i)]);
			}
		}
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer line = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(line.nextToken());
		List<Integer> root = new ArrayList<>();
		arr = new Node[N];
		line = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N;i++)
			arr[i] = new Node(-1);
		for(int i=0;i<N;i++)
		{
			int parent = Integer.parseInt(line.nextToken());
			arr[i].parent = parent;
			if(parent != -1)
			{
				arr[parent].children.add(i);
			}
			else
				root.add(i);
		}
		line = new StringTokenizer(br.readLine(), " ");
		int delete = Integer.parseInt(line.nextToken());
		if(arr[delete].parent == -1)
			root.remove(new Integer(delete));
		else
			arr[arr[delete].parent].children.remove(new Integer(delete));
		for(int i=0;i<root.size();i++)
		{
			count(arr[root.get(i)]);
		}
		System.out.println(result);
	}

}
