import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        ArrayList<Integer>[] arr = new ArrayList[501];

        for(int i=0;i<n+1;i++)
            arr[i] = new ArrayList<>();
        for(int i=0;i<m;i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            arr[a].add(b); arr[b].add(a);
        }

        int[] visited = new int[501];
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(1);

        while(!q.isEmpty()){
            int cur = q.poll();
            visited[cur] = 1;

            ArrayList<Integer> friend = arr[cur];
            for(int i=0;i<friend.size();i++){
                int next = friend.get(i);
                if((cur==1||arr[1].contains(cur))&&visited[next]==0)
                    q.add(next);
            }
        }
        int sum = 0;
        for(int i=2;i<n+1;i++){
            if(visited[i]==1) sum++;
        }
        System.out.println(sum);

    }


}