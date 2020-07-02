import java.util.Scanner;
import java.util.Stack;

public class iron_10799 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String str = input.next();
		char[] c_tmp = str.toCharArray();
		
		int count = 0;
		
		Stack<Character> stack = new Stack<>();
		for(int i = 0; i < c_tmp.length; i++) {
			if (c_tmp[i] == '(') {
				stack.push(c_tmp[i]);
			} else {
				if(c_tmp[i - 1] == '(') {
					stack.pop();
					count += stack.size();
				} else {
					stack.pop();
					count += 1;
				}
			}
		}
		System.out.println(count);
	}
}
