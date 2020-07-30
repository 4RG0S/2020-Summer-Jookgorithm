import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        int[][] input = new int[n+1][n+1];
        int[] visited = new int[n+1];
        for(int i=0;i<m;i++){
            int x = scan.nextInt();
            int y = scan.nextInt();
            input[x][y] = input[y][x] = 1;
        }
        int answer = 0;
        for(int i=1;i<=n;i++){
            if(visited[i] == 0){
                DFS(input, visited, i, n);
                answer ++;
            }
        }
        System.out.println(answer);
    }
    public static void DFS(int[][] input, int[] visited, int cur, int n){

        Stack<Integer> stack = new Stack();
        stack.push(cur);

        while(!stack.empty()){
            int curI = stack.pop();
            visited[curI] = 1;

            for(int i=1;i<=n;i++) {
                if (input[curI][i] == 1 && visited[i] == 0) {
                    stack.push(i);
                }
            }
        }
    }
}