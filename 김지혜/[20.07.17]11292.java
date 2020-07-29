import java.util.PriorityQueue;
import java.util.Scanner;

public class Main{

    public static class Height implements Comparable<Height> {
        String name;
        float height;
        int order;
        public Height(String name, float height, int order){
            this.name = name;
            this.height = height;
            this.order = order;
        }

        @Override
        public int compareTo(Height o1) {
            if(o1.height>this.height) return 1;
            else if(o1.height<this.height) return -1;
            else if(o1.order<this.order) return 1;
            else if(o1.order<this.order) return -1;
            else return 0;
        }
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        while(n!=0){
            PriorityQueue<Height> q = new PriorityQueue<>();
            for(int i=0;i<n;i++){
                q.add(new Height(scan.next(), scan.nextFloat(), i));
            }
            Height h = q.peek();
            while(!q.isEmpty() && h.height == q.peek().height){
                System.out.print(q.poll().name+" ");
            }
            System.out.println();
            n = scan.nextInt();

        }

    }

}