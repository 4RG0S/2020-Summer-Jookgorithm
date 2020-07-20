import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[][] arr = new int[30][30];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(),"\n");
        int t = Integer.parseInt(st.nextToken());
        int n,m;
        combination();
        for(int i = 0; i < t; i++){
            st = new StringTokenizer(br.readLine()," ");
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            System.out.println(arr[m][n]);
        }
    }
    public static void combination(){
        for(int i = 0; i <= 29; i++){
            for(int j = 0; j <= i; j++){
                if(i==j||j==0)  arr[i][j] = 1;
                else arr[i][j] = arr[i-1][j-1]+arr[i-1][j];
            }
        }
    }
}