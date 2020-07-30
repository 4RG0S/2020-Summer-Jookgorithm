import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] sum = new int[n+1];
        sum[1] = scan.nextInt();
        for(int i=2;i<=n;i++){
            sum[i] = sum[i-1]+scan.nextInt();
        }

        int m = scan.nextInt();
        for(int i=0;i<m;i++){
            int k = scan.nextInt();
            int j = scan.nextInt();

            System.out.println(sum[j]-sum[k-1]);
        }
    }
}