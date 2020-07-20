import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int a_size, b_size;
    static int[] a, b;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine().trim(), " ");
            a_size = Integer.parseInt(st.nextToken());
            b_size = Integer.parseInt(st.nextToken());
            a = new int[a_size];
            b = new int[b_size];
            st = new StringTokenizer(br.readLine().trim()," ");
            for(int j = 0; j < a_size; j++)
                a[j] = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine().trim()," ");
            for(int j = 0; j < b_size; j++)
                b[j] = Integer.parseInt(st.nextToken());
            System.out.println(pair());
        }
    }
    public static int pair(){
        Arrays.sort(a);
        Arrays.sort(b);
        int cnt = 0;
        for(int i = 0; i < a_size; i++){
            for(int j = 0; j < b_size; j++){
                if(a[i] <= b[j]) break;
                else cnt++;
            }
        }
        return cnt;
    }
}