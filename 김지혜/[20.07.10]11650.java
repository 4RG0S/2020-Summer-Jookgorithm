import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main{

    public static class Pair{
        int x;
        int y;

        public Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    public static class Comparator implements java.util.Comparator<Pair> {

        @Override
        public int compare(Pair o1, Pair o2) {
            if(o1.x > o2.x)
                return 1;
            else if(o1.x < o2.x)
                return -1;
            else{
                if(o1.y > o2.y)
                    return 1;
                else if(o1.y < o2.y)
                    return -1;
                else return 0;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        Comparator c = new Comparator();
        PriorityQueue<Pair> p = new PriorityQueue<>(c);

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for(int i=0;i<n;i++){
            p.add(new Pair(scan.nextInt(), scan.nextInt()));
        }
        while(!p.isEmpty()){
            Pair aPair = p.poll();
            System.out.println(aPair.x+" "+aPair.y);
        }
    }

}