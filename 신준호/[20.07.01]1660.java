import jdk.nashorn.internal.parser.Scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {

    static int[] dp;
    static int[] cannonBall;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        String[] tokens;

        //input = br.readLine();
        //tokens = input.split(" ");

        int n = Integer.parseInt(br.readLine());

        cannonBall = new int[120];
        for(int i = 1; i <= cannonBall.length; i++)
            //cannonBall[i - 1] = i * (i+1) * (i+2) / 6;
            cannonBall[cannonBall.length - i] = i * (i+1) * (i+2) / 6;


        dp = new int[n+1];
        System.out.println(minStackedCnt(n));

    }

    public static int minStackedCnt(int n) {

        if(n == 0) return 0;
        if(dp[n] != 0) return dp[n];

        int min = Integer.MAX_VALUE;
        for(int i = 0; i < cannonBall.length; i++) {
            if(cannonBall[i] <= n) min = Math.min(min, minStackedCnt(n - cannonBall[i]) + 1);
        }

        return dp[n] = min;
    }


}