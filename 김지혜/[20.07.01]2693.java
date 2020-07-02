import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for(int i=0;i<n;i++){
            PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
            for(int j=0;j<10;j++){
                pq.add(scan.nextInt());
            }
            pq.poll();
            pq.poll();
            System.out.println(pq.poll());
        }
    }
}