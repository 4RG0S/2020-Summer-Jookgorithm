package July;

import java.util.HashSet;
import java.util.Scanner;

public class July_06_3671 {

	static int val[];
	static int value;
	static int result = 0;
	static HashSet<Integer> set;

	static boolean isPrime(int n) {
		if (n < 2)
			return false;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		//System.out.println(n);
		return true;
	}

	static void track() {
		if (!set.contains(value) && isPrime(value)) {
			set.add(value);
			result++;
		}
		for (int i = 0; i < 10; i++) {
			int temp = value;
			if (val[i] > 0) {
				val[i]--;
				value = value * 10 + i;
				track();
				value = temp;
				val[i]++;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int c = scan.nextInt();
		scan.nextLine();
		for (int i = 0; i < c; i++) {
			value = 0;
			val = new int[10];
			String line = scan.nextLine();
			for (char temp : line.toCharArray()) {
				val[temp - '0']++;
			}
			set = new HashSet<>();
			track();
			System.out.println(result);
			result = 0;
		}

	}
}
