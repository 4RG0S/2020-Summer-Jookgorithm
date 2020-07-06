import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String n = scan.next();

        PriorityQueue q = new PriorityQueue(Comparator.reverseOrder());

        for(int i=0;i<n.length();i++){
            int a = Integer.parseInt(n.charAt(i)+"");
            q.add(a);
        }
        while(!q.isEmpty()){
            System.out.print(q.poll());
        }
    }

}