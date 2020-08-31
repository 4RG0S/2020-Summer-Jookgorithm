import java.io.IOException;
import java.math.BigInteger;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        PriorityQueue<BigInteger> pq = new PriorityQueue<>();
        for(int i=0;i<n;i++){
            String input = scan.next();
            String forInt[] = input.replaceAll("[a-z]", " ").split(" ");
            for(int j=0;j<forInt.length;j++){
                String aStr = forInt[j];
                if(aStr.trim().equals("")) continue;
                while(aStr.charAt(0)=='0' && aStr.length()>1) aStr = aStr.substring(1);
                pq.add(new BigInteger(aStr));
            }

        }
        while(!pq.isEmpty())
            System.out.println(pq.poll());

    }


}