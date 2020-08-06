import java.util.Scanner;

public class Main {
    static int[] c;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        int[] trace = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = scan.nextInt();
        c = new int[n+1];
        c[0] = a[0];
        int count = 0;
        for(int i = 1; i < n; i++){
            if(c[count] < a[i]) {
                c[++count] = a[i];
            }
            else {
                int j = search(0, count, a[i]);
                c[j] = a[i];
            }
        }
        System.out.println(count+1);

    }
    public static int search(int s, int e, int n){
        while(e > s){
            int mid = (s + e) / 2;
            if(c[mid] >= n){
                e = mid;
            }
            else s = mid + 1;
        }
        return e;
    }
}