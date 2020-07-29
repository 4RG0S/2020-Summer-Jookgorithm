import java.util.PriorityQueue;
import java.util.Scanner;

public class Main{

    static PriorityQueue<Integer> pq;
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        char[] chars = input.toCharArray();

        int inputInt = Integer.parseInt(input);
        pq = new PriorityQueue<>();

        perm(chars, 0);
        int answer = 0;

        while (!pq.isEmpty() && inputInt >= pq.peek()) pq.poll();
        if(!pq.isEmpty()) answer = pq.poll();

        System.out.println(answer);
    }
    public static void perm(char[] chars, int pivot){
        if(pivot == chars.length) return;

        for(int i=pivot;i<chars.length;i++){
            pq.add(swapString(chars, i, pivot));
            perm(chars, pivot+1);
            pq.add(swapString(chars, i, pivot));
        }
    }
    public static int swapString(char[] chars, int i, int j){
        if(i<0 || j>chars.length-1) return 0;
        char tmp = chars[i];
        chars[i] = chars[j];
        chars[j] = tmp;

        String str = "";
        for(int h=0;h<chars.length;h++){
            str = str + chars[h];
        }
        return Integer.parseInt(str);
    }
}