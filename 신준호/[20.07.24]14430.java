import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        String[] tokens;

        //input = br.readLine();
        //tokens = input.split(" ");

        tokens = br.readLine().split(" ");
        int n, m;
        n = Integer.parseInt(tokens[0]);
        m = Integer.parseInt(tokens[1]);

        boolean[][] map = new boolean[n][m];
        for(int i = 0; i < n; i++) {
            tokens = br.readLine().split(" ");
            for(int j = 0; j < m; j++)
                map[i][j] = tokens[j].equals("1");
        }

        dp = new int[n][m];
        System.out.println(maximumResource(map, 0, 0));


    }

    public static int maximumResource(boolean[][] map, int row, int col) {

        if(dp[row][col] != 0) return dp[row][col];

        int opt = map[row][col]? 1 : 0;

        int right = 0, down = 0;
        if(row + 1 < map.length) down = maximumResource(map, row + 1, col);
        if(col + 1 < map[0].length) right = maximumResource(map, row, col + 1);

        opt += Math.max(right, down);
        return dp[row][col] = opt;
    }

}

