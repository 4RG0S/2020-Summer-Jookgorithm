import java.util.Scanner;
import java.util.Stack;

public class P10828 {
	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Stack<Integer> st = new Stack<>();
		
		for(int i=0; i<n; i++) {
			String com = scan.next();
			//명령어
			switch(com) {
				case "push":
					st.push(scan.nextInt());
					break;
				case "pop":
					if(st.empty()) {
						System.out.println(-1);
					} else {
						System.out.println(st.pop());
					}
					break;
				case "size":
					System.out.println(st.size());
					break;
				case "empty":
					if(st.empty()) {
						System.out.println(1);
					} else {
						System.out.println(0);
					}
					break;
				case "top":
					if(st.empty()) {
						System.out.println(-1);
					} else {
						System.out.println(st.peek());
					}
					break;
			}
		}
	}
}
