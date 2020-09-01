import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = br.readLine();
        int n = Integer.parseInt(inputStr);

        int[] input = new int[n];
        StringTokenizer st = null;
        inputStr = br.readLine();
        st = new StringTokenizer(inputStr);

        for(int i=0;i<n;i++){
            input[i] = Integer.parseInt(st.nextToken());
        }
        int[][] dp = new int[n][n];

        for(int i=0;i<n;i++){
            dp[i][i] = 1;
            if(i<n-1 && input[i] == input[i+1])
                dp[i][i+1] = 1;
        }
        for(int i=0;i<n;i++){
            DP(dp, input, n, i, i+1);
            DP(dp, input, n, i, i+2);
        }
        int m = Integer.parseInt(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0;i<m;i++){
            inputStr = br.readLine();
            st = new StringTokenizer(inputStr);

            bw.write(dp[Integer.parseInt(st.nextToken())-1][Integer.parseInt(st.nextToken())-1]+"\n");
        }
        br.close();
        bw.close();

    }
    public static void DP(int[][] dp, int[] input, int n, int left, int right){
        if(left<0 || right>=n) return;

        if(dp[left+1][right-1] == 1 && input[left] == input[right])
            dp[left][right] = 1;

        DP(dp, input, n, left-1, right+1);
    }

}