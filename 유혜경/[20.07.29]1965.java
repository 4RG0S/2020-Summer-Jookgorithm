import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test {
    static int n;
    static int[] arr = new int[1000];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine().trim(), " ");
        n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine().trim(), " ");
        for(int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(st.nextToken());
        int[] dp = new int[n];
        dp[0] = 1; int max = 1;
        for(int i = 1; i < n; i++){
            dp[i] = 1;
            for(int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) dp[i] = Math.max(dp[i], dp[j] + 1);
            }
            max = Math.max(max, dp[i]);
        }
        System.out.println(max);
    }
}