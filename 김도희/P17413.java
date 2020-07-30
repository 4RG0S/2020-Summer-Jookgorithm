import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class P17413 {
	public static void main (String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		Stack<Character> stack = new Stack<>();
		//문자열 입력 시 거꾸로 출력 단, <> 안에 있는 것은 pass
		boolean check = false;
		
		for(int i=0; i<str.length(); i++) {
			char n = str.charAt(i); 
			switch(n) {
				case '<':
					print(stack);
					System.out.print(n);
					check = true;
					break;
				case '>':
					check = false;
					print(stack);
					System.out.print(">");
					break;
				case ' ':
					if(check == false) {
						//기호 <가 아니면
						print(stack);
						System.out.print(" ");
					} else {
						//기호 <이면 그대로 넣기
						System.out.print(n);
					}
					break;
				default:
					//알파벳인 경우
					if(check == false) {
						stack.push(n);
					} else {
						System.out.print(n);
					}
					break;
			}
		}
		
		print(stack);
		
	}
	public static void print(Stack s) {
		while(!s.isEmpty()) {
			System.out.print(s.pop());
		}
	}
}
