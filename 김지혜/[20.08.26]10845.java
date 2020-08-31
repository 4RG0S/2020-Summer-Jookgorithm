import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) throws Exception	{

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        Deque<Integer> q = new LinkedList<>();

        for(int i=0;i<=n;i++){
            String input = scan.nextLine();

            if(input.equals("pop")){
                if(q.isEmpty()) System.out.println("-1");
                else System.out.println(q.removeFirst());
            }
            else if(input.equals("size"))
                System.out.println(q.size());
            else if(input.equals("empty")){
                if(q.isEmpty()) System.out.println("1");
                else System.out.println("0");
            }
            else if(input.equals("front")) {
                if(q.isEmpty()) System.out.println("-1");
                else
                    System.out.println(q.getFirst());
            }
            else if(input.equals("back")) {
                if(q.isEmpty()) System.out.println("-1");
                else
                    System.out.println(q.getLast());
            }
            else if(!input.equals("")){
                String[] inputs = input.split(" ");
                q.add(Integer.parseInt(inputs[1]));
            }
        }


    }

}