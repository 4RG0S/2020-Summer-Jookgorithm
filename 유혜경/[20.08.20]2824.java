import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger in = BigInteger.ONE;
        for(int i = 0; i < n; i++)
            in = in.multiply(BigInteger.valueOf(sc.nextInt()));
        int m = sc.nextInt();
        BigInteger im = BigInteger.ONE;
        for(int i = 0; i < m; i++)
            im = im.multiply(BigInteger.valueOf(sc.nextInt()));
        BigInteger ret = in.gcd(im);
        if(ret.compareTo(BigInteger.valueOf(100000000)) == 1)
            System.out.printf("%09d",ret.remainder(BigInteger.valueOf(1000000000)));
        else
            System.out.println(ret);
    }
}