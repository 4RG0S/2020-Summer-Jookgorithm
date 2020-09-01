import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        float[] score = new float[n];
        for(int i = 0; i < n; i++)
            score[i] = scan.nextFloat();
        Arrays.sort(score);
        for(int i = 0; i < 7; i++)
            System.out.printf("%.3f\n",score[i]);
    }
}