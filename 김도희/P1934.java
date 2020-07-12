import java.util.Scanner;

public class P1934 {
	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt(); //몇번 
		
		for(int i=0; i<num; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			//최대 공약수 GCD 먼저 구하기
			int a2 = a;
			int b2 = b;
			
			while(b2 > 0) {
				int temp = b2;
				b2 = a2%b2;
				a2 = temp;
			}
			int gcd = a2;
			//최소 공배수 LCM, 두 수의 곱 / 두 수의 최대 공약수
			int lcm = a*b/gcd;
			
			System.out.println(lcm);
		}
		
	}
}
