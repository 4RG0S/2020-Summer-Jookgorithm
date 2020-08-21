package August;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class August_18_2910 {
	
	static class num implements Comparable<num>{
		int val, count = 0;
		public num(int val)
		{
			this.val = val;
			this.count++;
		}
		@Override
		public int compareTo(num o) {
			return o.count - this.count;
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int c = scan.nextInt();
		List<num> list = new ArrayList<>();
		scan.nextLine();
		StringTokenizer line = new StringTokenizer(scan.nextLine(), " ");
		while(line.hasMoreTokens())
		{
			int num = Integer.parseInt(line.nextToken());
			boolean temp = false;
			for(int i=0;i<list.size();i++)
			{
				if(list.get(i).val == num)
				{
					temp = true;
					list.get(i).count++;
				}
			}
			if(!temp)
				list.add(new num(num));
		}
		Collections.sort(list);
		for(int i=0;i<list.size();i++)
		{
			for(int j=0;j<list.get(i).count;j++)
				System.out.print(list.get(i).val + " ");
		}
	}

}
