import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();

        int[] egg = new int[m];
        for(int i=0;i<m;i++){
            egg[i] = scan.nextInt();
        }
        Arrays.sort(egg);
        int max = 0;
        int price = 0;

        for(int i=m-1;i>=0&&i>=m-1-n;i--){
            if(m-i<n) {
                if (max < egg[i] * (m - i)) {
                    max = egg[i] * (m - i);
                    price = egg[i];
                }
            }
            else{
                if (max < egg[i] * n){
                    max = egg[i] * n;
                    price = egg[i];
                }
            }
        }
        System.out.println(price+" "+max);

    }

}