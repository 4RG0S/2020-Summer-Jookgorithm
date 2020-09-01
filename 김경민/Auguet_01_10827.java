package August;

import java.math.BigDecimal;
import java.util.Scanner;

public class Auguet_01_10827 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String line = scan.nextLine();
		String split[] = line.split(" ");
		BigDecimal result = new BigDecimal(split[0]);
		result = result.pow(Integer.parseInt(split[1]));
		System.out.println(result.toPlainString());
	}

}
