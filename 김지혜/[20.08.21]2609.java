import java.util.Scanner;

public class Main {

    public static void main(String args[]) throws Exception	{
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println(GCD(a, b));
        System.out.println(a*b/GCD(a, b));
    }
    public static int GCD(int a, int b){
        while(b!=0){
            int c = a%b;
            a = b;
            b = c;
        }
        return a;
    }


}