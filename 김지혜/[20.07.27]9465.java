import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for(int i=0;i<n;i++){
            int m = scan.nextInt();
            int[][] input = new int[2][m];

            for(int j=0;j<m;j++) input[0][j] = scan.nextInt();

            for(int j=0;j<m;j++) input[1][j] = scan.nextInt();

            int[][] dp = new int[2][m];
            dp[0][0] = input[0][0]; dp[1][0] = input[1][0];
            dp[0][1] = dp[1][0]+input[0][1]; dp[1][1] = dp[0][0]+input[1][1];

            for(int j=2;j<m;j++){
                dp[0][j] = Math.max(dp[1][j-1]+input[0][j], dp[0][j-1]);
                dp[0][j] = Math.max(dp[0][j], Math.max(dp[0][j-2], dp[1][j-2])+input[0][j]);
                dp[1][j] = Math.max(dp[0][j-1]+input[1][j], dp[1][j-1]);
                dp[1][j] = Math.max(dp[1][j], Math.max(dp[0][j-2], dp[1][j-2])+input[1][j]);
            }

            System.out.println(Math.max(dp[1][m-1], dp[0][m-1]));
        }
    }
}