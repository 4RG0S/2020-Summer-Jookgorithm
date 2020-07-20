import java.util.Scanner;
import java.util.Stack;

public class P1935 {
	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		String expr = scan.next(); //식
		Stack<Character> stack = new Stack<>();
		
		for(int i=0; i<expr.length(); i++) {
			if(priority(expr.charAt(i)) == -1) {
				//문자일 경우 그냥 출력
				System.out.print(expr.charAt(i));
			}
			else {
				//기호일 경우 우선순위 파악
				if(stack.empty() || expr.charAt(i) == '(') {
					//비었으면 그냥 삽입하기
					stack.push(expr.charAt(i));
				} 
				else if(expr.charAt(i) == ')') {
					//top에 있는 것보다 수가 클 경우
					while(!stack.isEmpty() && stack.peek() != '(') {
						System.out.print(stack.pop());
					}
					stack.pop();
				}
				else {
					while(!stack.isEmpty() && priority(stack.peek()) >= priority(expr.charAt(i))){
						//우선순위가 작으면
						System.out.print(stack.pop());
					}
					stack.push(expr.charAt(i));
				}
			}
		}
		while(!(stack.empty())) {
			if(stack.peek() == '(') {
				stack.pop();
			} else {
				System.out.print(stack.pop());
			}
		}
		
	}
	public static int priority(char ch) {
		//우선순위가 높을수록 숫자가 큼
		switch(ch) {
			case '*':
			case '/':
				return 2;
			case '+':
			case '-': 
				return 1;
			case '(':
			case ')':
				return 0;
		}
		return -1;
	}
}
