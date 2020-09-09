import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long ret = (long)Math.sqrt(n);
        if(Math.pow(ret,2) < n) System.out.println(ret+1);
        else System.out.println(ret);
    }
}