import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        String[] tokens;

        //input = br.readLine();
        //tokens = input.split(" ");
        
        tokens = br.readLine().split(" ");
        int c, n;
        c = Integer.parseInt(tokens[0]);
        n = Integer.parseInt(tokens[1]);
        City[] cities = new City[n];
        for(int i = 0; i < n; i++) {
            tokens = br.readLine().split(" ");
            int cost = Integer.parseInt(tokens[0]);
            int expected = Integer.parseInt(tokens[1]);
            cities[i] = new City(cost, expected);
        }

        dp = new int[c+1];
        System.out.println(minimumCost(cities, c));

    }

    public static int minimumCost(City[] cities, int c) {

        if(c <= 0) return 0;
        if(dp[c] != 0) return dp[c];

        int opt = Integer.MAX_VALUE;
        for(int i = 0; i < cities.length; i++) {
            opt = Math.min(minimumCost(cities, c - cities[i].expected) + cities[i].cost, opt);
        }

        return dp[c] = opt;
    }

    public static class City {
        int cost;
        int expected;

        City(int cost, int expected) {
            this.cost = cost;
            this.expected = expected;
        }
    }

}

