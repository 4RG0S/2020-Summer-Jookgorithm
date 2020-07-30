import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main{

    public static class Pair{
        int row;
        int col;
        public Pair(int row, int col){
            this.row = row;
            this.col = col;
        }
    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        while(!input.equals("0 0")) {
            StringTokenizer st = new StringTokenizer(input);
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            int[][] island = new int[m][n];
            int[][] visited = new int[m][n];

            Queue<Pair> q = new LinkedList<>();
            for (int i = 0; i < m; i++) {
                String row = br.readLine();
                st = new StringTokenizer(row);
                for (int j = 0; j < n; j++) {
                    island[i][j] = Integer.parseInt(st.nextToken());
                    if (island[i][j] == 1) q.add(new Pair(i, j));
                }
            }
            int answer = 0;
            while (!q.isEmpty()) {
                Pair cur = q.poll();
                if (visited[cur.row][cur.col] == 1)
                    continue;

                visited[cur.row][cur.col] = 1;
                BFS(visited, island, n, m, cur.row, cur.col);
                answer++;
            }
            System.out.println(answer);
            input = br.readLine();
        }
    }
    public static void BFS(int[][] visited, int[][] island, int n, int m, int row, int col){
        int[][] dist = {{-1, 0}, {1, 0}, {0, -1}, {0, 1},
                {1, 1}, {-1, -1}, {-1, 1}, {1, -1}};

        for (int i = 0; i < 8; i++) {
            int nextRow = row+dist[i][0];
            int nextCol = col+dist[i][1];

            if (nextRow < 0 || nextRow >= m || nextCol < 0 || nextCol >= n) continue;

            if (visited[nextRow][nextCol] == 0 && island[nextRow][nextCol] == 1) {
                visited[nextRow][nextCol] = 1;
                BFS(visited,island, n, m,  nextRow, nextCol);
            }

        }
    }
}