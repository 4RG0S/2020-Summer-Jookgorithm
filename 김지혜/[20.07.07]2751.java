import java.io.*;
import java.util.PriorityQueue;

public class Main{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> q = new PriorityQueue<>();
        for(int i=0;i<n;i++){
            q.add(Integer.parseInt(br.readLine()));
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(!q.isEmpty()){
            bw.write(q.poll()+"\n");
        }
        br.close();
        bw.close();
    }

}