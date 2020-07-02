import javafx.util.Pair;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main{

    static int[][] visited;
    static int answer;
    static int n;
    static int m;
    static Queue<Pair<Integer, Integer>> q;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        visited = new int[m][n];
        int[][] input = new int[m][n];

        q = new LinkedList<Pair<Integer, Integer>>();
        for (int i = 0; i < m; i++) {
            str = br.readLine();
            st = new StringTokenizer(str);
            for (int j = 0; j < n; j++) {
                input[i][j] = Integer.parseInt(st.nextToken());
                if(input[i][j] == 1)
                    q.add(new Pair(i, j));
            }
        }
        q.add(new Pair(-1, -1));

        answer = 0;
        while(!q.isEmpty()){

            Pair<Integer, Integer> cur = q.poll();

            if(q.isEmpty()) break;
            while(cur.getKey() != -1){
                spread(input, cur.getKey(), cur.getValue());
                cur = q.poll();
            }
            answer ++;
            q.add(new Pair(-1, -1));
        }
        if(isFull(input)){
            System.out.println(answer-1);
        }else System.out.println("-1");


    }
    public static void spread(int[][] input, int r, int c){
        int[][] dist = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                int nextR = r+dist[i][0];
                int nextC = c+dist[i][1];

                if(nextR<m && nextR>=0 && nextC<n && nextC>=0){
                    if(input[nextR][nextC] == 0) {
                        input[nextR][nextC] = 1;
                        q.add(new Pair(nextR, nextC));
                    }
                }

            }
        }
    }
    public static boolean isFull(int[][] input){
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(input[i][j] == 0) return false;

            }
        }
        return true;
    }

}