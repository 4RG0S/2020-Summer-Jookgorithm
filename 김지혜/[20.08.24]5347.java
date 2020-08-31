import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) throws Exception	{
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for(int i=0;i<n;i++){
            BigInteger a = scan.nextBigInteger();
            BigInteger b = scan.nextBigInteger();

            System.out.println(a.multiply(b).divide(a.gcd(b)));
        }
    }

}