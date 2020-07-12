import jdk.nashorn.internal.parser.Scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        String[] tokens;

        //input = br.readLine();
        //tokens = input.split(" ");

        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++) {
            tokens = br.readLine().split(" ");
            int[] scores = new int[tokens.length -1];
            int[] diff = new int[tokens.length - 2];
            for(int j = 0; j < scores.length; j++)
                scores[j] = Integer.parseInt(tokens[j + 1]);
            Arrays.sort(scores);
            for(int j = 0; j < diff.length; j++)
                diff[j] = scores[j+1] - scores[j];
            Arrays.sort(diff);
            System.out.println("Class " + (i + 1));
            System.out.println("Max " + scores[scores.length - 1] + ", Min " + scores[0] + ", Largest gap " + diff[diff.length - 1]);
        }

    }


}