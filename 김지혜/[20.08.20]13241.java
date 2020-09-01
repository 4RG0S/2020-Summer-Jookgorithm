import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        long a = scan.nextLong();
        long b = scan.nextLong();
        System.out.println(a*b/GCD(a, b));
    }
    public static long GCD(long a, long b){
        while(b!=0){
            long c = a%b;
            a = b;
            b = c;
        }
        return a;
    }

}