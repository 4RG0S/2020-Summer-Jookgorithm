import java.util.Scanner;
import java.util.Stack;

public class P1935 {
	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String expr = scan.next();
		double arr[] = new double[n];
		Stack<Double> st = new Stack<>();
		
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		
		for(int i=0; i<expr.length(); i++) {
			char ch = expr.charAt(i);
			switch(ch) {
				case '+':
				case '-':
				case '*':
				case '/':
					calThis(st, st.pop(), st.pop(), ch);
					break;
				default:
					//기호가 아닐 경우 (피연산자), 순서대로 쓰므로
					st.push(arr[ch - 'A']);
					break;
				
			}
		}
		System.out.format("%.2f", st.peek());
	}
	
	public static void calThis(Stack<Double> st, double a, double b, char ex) {
		switch(ex) {
			case '+':
				st.push(b+a);
				break;
			case '*':
				st.push(b*a);
				break;
			case '-':
				st.push(b-a);
				break;
			case '/':
				st.push(b/a);
				break;
			default:
				break;
		}
	}
}
