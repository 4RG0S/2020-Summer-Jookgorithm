import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        String[] tokens;

        //input = br.readLine();
        //tokens = input.split(" ");

        int n = Integer.parseInt(br.readLine());

        double[] scores = new double[7];
        double max = 0;
        for(int i = 0; i < 7; i++) {
            scores[i] = Double.parseDouble(br.readLine());
            if(scores[i] > max) max = scores[i];
        }

        for(int i = 7; i < n; i++) {
            double val = Double.parseDouble(br.readLine());
            if(max > val) {
                swapMaxToVal(scores, max, val);
                max = max(scores);
            }
        }

        Arrays.sort(scores);
        for(int i = 0; i < scores.length; i++)
            System.out.printf("%.3f\n", scores[i]);

    }

    public static void swapMaxToVal(double[] scores, double max, double val) {
        for(int i = 0; i < scores.length; i++) {
            if(scores[i] == max) {
                scores[i] = val;
                break;
            }
        }
    }

    public static double max(double[] scores) {
        double max = 0;
        for(int i = 0; i < scores.length; i++)
            max = Math.max(max, scores[i]);
        return max;
    }

}
