import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        BigInteger[] bi = new BigInteger[n+1];
        bi[0] = BigInteger.ZERO;
        bi[1] = BigInteger.ONE;
        for(int i=2;i<=n;i++){
            bi[i] = bi[i-2].add(bi[i-1]);
        }
        System.out.println(bi[n]);

    }

}


