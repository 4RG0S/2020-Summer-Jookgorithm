package July;

import java.util.Scanner;

public class July_29_8979 {

	static int count = 1;
	
	static class country{
		int gold, silver, bronze;
		public country(int g, int s, int b)
		{
			this.gold = g;
			this.silver = s;
			this.bronze = b;
		}
	}
	
	static void isBig(country ori, country comp)
	{
		if(ori.gold < comp.gold)
			count++;
		else if((ori.gold == comp.gold) && (ori.silver < comp.silver))
			count++;
		else if((ori.gold == comp.gold) && (ori.silver == comp.silver) && (ori.bronze < comp.bronze))
			count++;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
		scan.nextLine();
		country arr[] = new country[N];
		country comp = null;
		for(int i=0;i<N;i++)
		{
			String line = scan.nextLine();
			String split[] = line.split(" ");
			arr[i] = new country(Integer.parseInt(split[1]), Integer.parseInt(split[2]), Integer.parseInt(split[3]));
			if(Integer.parseInt(split[0]) == K)
				comp = arr[i];
		}
		for(int i=0;i<N;i++)
		{
			isBig(comp, arr[i]);
		}
		System.out.println(count);
	}

}
