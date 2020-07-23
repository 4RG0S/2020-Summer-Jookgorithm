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
            long n = Long.parseLong(br.readLine());
            if(n == 0 || n == 1) {
                System.out.println("2");
                continue;
            }
            for(long j = n; true; j++) {
                boolean isPrime = true;
                for(int k = 2; k <= Math.sqrt(j); k++) {
                    if(j % k == 0) {
                        isPrime = false; break;
                    }
                }
                if(isPrime) {
                    System.out.println(j);
                    break;
                }
            }
        }

    }


}

