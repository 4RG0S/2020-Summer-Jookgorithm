import java.util.*;

public class Main {
    static int[] A = new int[10];
    static int N = 3;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for(int i = 0; i < T; i++){
            for(int j = 0; j < 10; j++){
                A[j] = scan.nextInt();
            }
            Arrays.sort(A);
            System.out.println(A[10-N]);
        }
    }
}