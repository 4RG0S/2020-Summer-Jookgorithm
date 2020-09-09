import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+1];
        int[] sum = new int[n+1];
        sum[0] = 0;
        for(int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
            sum[i] += sum[i-1] + a[i];
        }
        int m = sc.nextInt();
        int[] ret = new int[m];
        for(int k = 0; k < m; k++){
            int i = sc.nextInt();
            int j = sc.nextInt();
            ret[k] = sum[j] - sum[i-1];
        }
        for(int k = 0; k < m; k++)
            System.out.println(ret[k]);
    }
}