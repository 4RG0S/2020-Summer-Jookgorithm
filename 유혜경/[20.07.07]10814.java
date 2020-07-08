import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[][] arr = new String[n][2];
        StringTokenizer s;
        for(int i = 0; i < n; i++){
            s = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = s.nextToken();
            arr[i][1] = s.nextToken();
        }
        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                int x = Integer.parseInt(o1[0]);
                int y = Integer.parseInt(o2[0]);
                return x - y;
            }
        });
        for(int i = 0; i < n; i++){
            System.out.println(arr[i][0]+" "+arr[i][1]);
        }
    }
}