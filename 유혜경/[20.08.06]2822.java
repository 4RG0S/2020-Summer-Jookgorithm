import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] score = new int[8][2];
        int[] num = new int[5];
        for(int i = 0; i < 8; i++) {
            score[i][0] = i+1;
            score[i][1] = sc.nextInt();
        }
        Arrays.sort(score, Comparator.comparing(o1 -> o1[1]));
        int sum = 0;
        for(int i = 3; i < 8; i++){
            sum += score[i][1];
            num[i-3] = score[i][0];
        }
        Arrays.sort(num);
        System.out.println(sum);
        for(int i = 0; i < 5; i++)
            System.out.print(num[i] + " ");
    }
}