import java.io.IOException;
import java.util.*;

public class Main{

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);

        PriorityQueue<Integer> aQ = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> bQ = new PriorityQueue<>();

        int n = scan.nextInt();

        if(n==1){
            System.out.println(scan.nextInt());
        }
        else{
            int a = scan.nextInt();
            System.out.println(a);
            int b = scan.nextInt();

            aQ.add(Math.min(a, b));
            bQ.add(Math.max(a, b));

            System.out.println(aQ.peek());

            for(int i=2;i<n;i++){
                int s = scan.nextInt();
                if(bQ.peek()>s) aQ.add(s);
                else bQ.add(s);

                if(aQ.size()<bQ.size())
                    aQ.add(bQ.poll());
                if(aQ.size()>bQ.size()+1)
                    bQ.add(aQ.poll());
                System.out.println(aQ.peek());
            }
        }
    }

}