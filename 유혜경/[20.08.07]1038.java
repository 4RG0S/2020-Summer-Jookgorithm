import java.util.Scanner;

public class Main {
    static int[] dp = new int[1000001];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n > 1022) System.out.println(-1);
        else if(n==1022) System.out.println("9876543210");
        else {
            for (int i = 0; i <= 9; i++)
                dp[i] = i;
            int digit = 1; int tmp = 1; int next = 10; int now = 0; int j = 0;
            for(int i = 10; i <= n; i++){
                if(Integer.toString(dp[j]).charAt(0)-'0' >= tmp) {
                    tmp++;
                    j = now;
                }
                if(tmp == 10){tmp = ++digit; j = next; now = next; next = i; }
                dp[i] = (int) (tmp*Math.pow(10, digit) + dp[j]);
                j++;
            }
            System.out.println(dp[n]);
        }
    }
}