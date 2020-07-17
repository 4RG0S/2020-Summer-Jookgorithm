import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        int[] arr = new int[n+1];
        StringTokenizer st = new StringTokenizer(br.readLine().trim()," ");
        for(int i = 1; i <= n; i++)
            arr[i] = Integer.parseInt(st.nextToken());
        int[] answer = new int[n+1];
        boolean[] occupy = new boolean[n+1];
        answer[arr[1]+1] = 1;
        occupy[arr[1]+1] = true;
        int cnt;
        for(int i = 2; i <= n; i++){
            cnt = 0;
            for(int j = 1; j <= n; j++) {
                if(!occupy[j]&&cnt==arr[i]) {
                    answer[j] = i;
                    occupy[j] = true;
                    break;
                }
                else if(!occupy[j]) cnt++;
            }
        }
        for(int i = 1; i <= n; i++)
            System.out.print(answer[i]+" ");
    }
}