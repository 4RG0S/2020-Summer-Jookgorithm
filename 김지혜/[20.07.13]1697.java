import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main{

    static int n;
    static int m;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = br.readLine();
        StringTokenizer st = new StringTokenizer(inputStr);

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        Queue<Integer> q = new LinkedList();
        int[] dist = new int[100001];
        int[] visited = new int[100001];

        Arrays.fill(dist, 100001);
        dist[n] = 0;
        q.add(n);

        while(!q.isEmpty()){
            int cur = q.poll();

            visited[cur] = 1;

            if(cur-1>=0 && cur-1<100001 && visited[cur-1]==0 && dist[cur-1]>dist[cur]+1){
                q.add(cur-1);
                dist[cur-1] = dist[cur]+1;
            }
            if(cur+1>=0 && cur+1<100001 && visited[cur+1]==0 && dist[cur+1]>dist[cur]+1){
                q.add(cur+1);
                dist[cur+1] = dist[cur]+1;
            }
            if(cur*2>=0 && cur*2<100001 && visited[cur*2]==0 && dist[cur*2]>dist[cur]+1){
                q.add(cur*2);
                dist[cur*2] = dist[cur]+1;
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(dist[m]+"\n");

        br.close();
        bw.close();
    }


}