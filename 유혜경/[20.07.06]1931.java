import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        int[][] conr = new int[n][2];
        StringTokenizer s;
        for(int i = 0; i < n; i++){
            s = new StringTokenizer(br.readLine(), " ");
            conr[i][0] = Integer.parseInt(s.nextToken());
            conr[i][1] = Integer.parseInt(s.nextToken());
        }
        Arrays.sort(conr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] == o2[1]) return o1[0] -o2[0];
                else return o1[1] - o2[1];
            }
        });
        int start = 0;
        int cnt = 1;
        for(int i = 1; i < n; i++){
            if(conr[i][0] >= conr[start][1]){
                start = i;
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}