import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("?�느 ??컴퓨?�공?�과 ?�생???�명??교수?�을 찾아가 물었??");
        recur(n, 0);
    }
    public static void recur(int n, int i) {
        if(n+1 == i) return;
        else {
            for(int j = 0; j < i; j++)
                System.out.print("____");
            System.out.println("\"?��??�수가 뭔�???\"");
            if(i == n){
                for(int j = 0; j < i; j++)
                    System.out.print("____");
                System.out.println("\"?��??�수???�기 ?�신???�출?�는 ?�수?�네\"");
            }
            else {
                for (int j = 0; j < i; j++)
                    System.out.print("____");
                System.out.println("\"???�어보게. ?�날?�날 ????�??기에 ?�세??모든 지?�을 ?�달???�인???�었??");
                for (int j = 0; j < i; j++)
                    System.out.print("____");
                System.out.println("마을 ?�람?��? 모두 �??�인?�게 ?�많?� 질문???�고, 모두 지?�롭�??�?�해 주었지.");
                for (int j = 0; j < i; j++)
                    System.out.print("____");
                System.out.println("그의 ?��? ?�부�??�았?�고 ?�네. 그런???�느 ?? �??�인?�게 ???�비가 찾아?�??물었??\"");
            }
            recur(n, i+1);
            for(int j = 0; j < i; j++)
                System.out.print("____");
            System.out.println("?�고 ?��??��?지.");
        }
    }
}