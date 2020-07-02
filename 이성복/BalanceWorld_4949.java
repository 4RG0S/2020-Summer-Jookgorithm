import java.util.Scanner;
import java.util.Stack;

public class BalanceWorld_4949 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		while(true) {
			String str = input.nextLine();
			if(str.equals(".")) {
				break;
			} else {
				Stack<Character> stack = new Stack<>();
				for(int i = 0; i < str.length(); i++) {
					if(str.charAt(i) == '(' || str.charAt(i) == '[') {
						stack.push(str.charAt(i));
					} else if ((str.charAt(i) <= 'z' && str.charAt(i) >= 'a') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')) {
						continue;
					} else {
						if (str.charAt(i) == ')') {
							if (stack.size() != 0 && stack.peek() == '(') {
								stack.pop();
							} else {
								stack.push('a');
								break;
							}
						} else if (str.charAt(i) == ']') {
							if (stack.size() != 0 && stack.peek() == '[') {
								stack.pop();
							} else {
								stack.push('a');
								break;
							}
						}
					}
				}
				if (stack.size() != 0) {
					System.out.println("no");
				} else {
					System.out.println("yes");
				}
			}
		}
		
		
		
	}

}
