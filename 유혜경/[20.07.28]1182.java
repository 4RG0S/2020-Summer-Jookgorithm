import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n,s, cnt = 0;
    static int[] arr = new int[20];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine().trim(), " ");
        n = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine().trim(), " ");
        for(int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(st.nextToken());
        subsequence_sum(0,0);
        if(s == 0) cnt--;
        System.out.println(cnt);
    }
    public static void subsequence_sum(int i ,int sum){
        if(i == n && sum == s) cnt++;
        if(i >= n) return;
        subsequence_sum(i + 1, sum + arr[i]);
        subsequence_sum(i + 1, sum);
    }
}