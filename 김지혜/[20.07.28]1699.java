import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] input = new int[n+1];
        for(int i=1;i<=n;i++){
            input[i] = i;

            if(Math.sqrt(i) == (int)Math.sqrt(i)){
                input[i] = 1;
                continue;
            }
            for(int j=i-1;j>=1;j--){
                input[i] = Math.min(input[i], input[i-j]+input[j]);

            }
        }
        System.out.println(input[n]);
    }
}