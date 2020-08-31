import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] input = new int[n];

        for(int i=0;i<n;i++){
            input[i] = scan.nextInt();
        }
        int[] dp = new int[n];

        int answer = 0;
        for(int i=0;i<n;i++){
            dp[i] = input[i];
            for(int j=0;j<i;j++){
                if(input[i]>input[j]){
                    dp[i] = Math.max(dp[i], dp[j]+input[i]);
                }
            }
            answer = Math.max(dp[i], answer);
        }
        System.out.println(answer);
    }

}