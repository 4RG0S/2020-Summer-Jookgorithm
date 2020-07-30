import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P10845 {
	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		Queue<Integer> q = new LinkedList<>();
		int n = scan.nextInt();
		int val = 0;
		for(int i=0; i<n; i++) {
			String st = scan.next();
			switch(st) {
			case "push":
				val = scan.nextInt();
				q.add(val);
				break;
			case "pop":
				if(q.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(q.poll());
				}
				break;
			case "size":
				System.out.println(q.size());
				break;
			case "empty":
				if(q.isEmpty()) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
				break;
			case "front":
				if(q.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(q.peek());
				}
				break;
			case "back":
				if(q.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(val);
				}
				break;
			}
		}
	}
}
