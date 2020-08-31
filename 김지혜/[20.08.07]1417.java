import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int me = scan.nextInt();

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<n-1;i++){
            pq.add(scan.nextInt());
        }

        int answer = 0;
        if(pq.size()==0) System.out.println("0");
        else {
            while (me <= pq.peek()) {
                me = me + 1;
                pq.add(pq.poll() - 1);
                answer = answer + 1;
            }
            System.out.println(answer);
        }
    }

}