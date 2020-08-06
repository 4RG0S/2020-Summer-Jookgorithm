import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static long[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        String[] tokens;

        //input = br.readLine();
        //tokens = input.split(" ");

        int n = Integer.parseInt(br.readLine());
        int[][] board = new int[n][n];
        for(int i = 0; i < n; i++) {
            tokens = br.readLine().split(" ");
            for(int j =0; j < n; j++)
                board[i][j] = Integer.parseInt(tokens[j]);
        }

        dp = new long[n][n];
        System.out.println(pathCnt(board, 0, 0));

    }

    public static long pathCnt(int[][] board, int row, int col) {

        if(dp[row][col] != 0) return dp[row][col];

        if(board[row][col] == 0) {
            return (row + 1 == board.length) && (col + 1 == board.length) ? 1 : 0;
        }
        long opt= 0;
        if(row + board[row][col] < board.length) opt += pathCnt(board, row + board[row][col], col);
        if(col + board[row][col] < board.length) opt += pathCnt(board, row, col + board[row][col]);

        return dp[row][col] = opt;
    }


}
