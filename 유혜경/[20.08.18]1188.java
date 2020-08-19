import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if(n > m) n -= m;
        System.out.println(m - gcd(m, n));
    }
    public static int gcd(int a, int b){
        int n;
        while(b != 0){
            n = a % b;
            a = b;
            b = n;
        }
        return a;
    }
}