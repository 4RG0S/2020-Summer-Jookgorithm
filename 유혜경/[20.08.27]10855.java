import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = scanner.nextInt();
        int jud = 0;
        for(int i = 1; i < n; i++) {
            if (a[i-1] > a[i]) jud = 1;
        }
        if(jud == 0) System.out.println("yes");
        else System.out.println("no");
    }
}