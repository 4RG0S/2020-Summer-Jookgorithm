import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int[] n = new int[t];
        for(int i = 0; i < t; i++)
            n[i] = scan.nextInt();
        int[] dp = new int[11];
        dp[1] = 1; dp[2] = 2; dp[3] = 4;
        for(int i = 4; i <= 10; i++){
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }
        for(int i = 0; i < t; i++)
            System.out.println(dp[n[i]]);
    }
}