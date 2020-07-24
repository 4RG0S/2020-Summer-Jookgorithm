import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        String[] tokens;

        //input = br.readLine();
        //tokens = input.split(" ");

        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++) {
            tokens = br.readLine().split(" ");
            int a, b;
            a = Integer.parseInt(tokens[0]);
            b = Integer.parseInt(tokens[1]);

            int gcd = a > b ? gcd(a, b) : gcd(b, a);
            System.out.println( a*b/gcd );
        }

    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a%b);
    }


}

