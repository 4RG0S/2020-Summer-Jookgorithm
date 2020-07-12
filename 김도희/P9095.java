import java.util.Scanner;

public class P9095 {
	static int cycle, getThis;
	static int time[];
	static int money[];
	
	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		cycle = scan.nextInt();
		
		time = new int[cycle]; //소요 날짜
		money = new int[cycle]; //비용
		
		for(int i=0; i<cycle; i++) {
			time[i] = scan.nextInt();
			money[i] = scan.nextInt();
		}
		
		schedule(0, 0);
		System.out.println(getThis);
	}
	
	//인자들은 모두 인덱스
	public static void schedule(int thisTime, int thisMoney) {
		
		if(thisTime >= cycle) {
			getThis = Math.max(getThis, thisMoney);
			return;
		}
		if(thisTime + time[thisTime] <= cycle) {
			schedule(thisTime + time[thisTime], thisMoney+money[thisTime]);
		}
		
		schedule(thisTime+1, thisMoney);
	}
}