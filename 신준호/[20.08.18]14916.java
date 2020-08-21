import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {

    static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        String[] tokens;

        //input = br.readLine();
        //tokens = input.split(" ");

        int n = Integer.parseInt(br.readLine());
        dp = new int[n+1];
        int c = coins(n);
        if(c == Integer.MAX_VALUE)
            System.out.println("-1");
        else
            System.out.println(c);
    }

    public static int coins(int n) {

        int min = Integer.MAX_VALUE;
        if(n == 0) return 0;
        if(n == 1) return min;

        if(dp[n] != 0) return dp[n];

        if(n >= 2) {
            int val = coins(n - 2);
            if(val != Integer.MAX_VALUE)
                min = val + 1;
        }
        if(n >= 5) {
            int val = coins(n - 5);
            if(val != Integer.MAX_VALUE)
                min = val + 1;
        }

        return dp[n] = min;
    }

}
