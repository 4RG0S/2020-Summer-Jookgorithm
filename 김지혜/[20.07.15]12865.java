import java.io.IOException;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        int[][] input = new int[n][2];
        for(int i=0;i<n;i++){
            input[i][0] = scan.nextInt();
            input[i][1] = scan.nextInt();
        }
        int[][] values = new int[n+1][m+1];
        for(int i=1;i<n+1;i++){
            for(int j=input[i-1][0];j<m+1;j++){
                values[i][j] = input[i-1][1];
            }
        }
        for(int i=2;i<n+1;i++) {
            int curWeight = input[i-1][0];
            int curValue = input[i-1][1];

            for(int j=1;j<m+1;j++){
                if(curWeight <= j){
                    values[i][j] = Math.max(curValue+values[i-1][j-curWeight], values[i-1][j]);
                }
                else{
                    values[i][j] = values[i-1][j];
                }

            }
        }
        System.out.println(values[n][m]);


    }

}