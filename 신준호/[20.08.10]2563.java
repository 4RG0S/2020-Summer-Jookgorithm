import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        String[] tokens;

        //input = br.readLine();
        //tokens = input.split(" ");

        boolean[][] paper = new boolean[100][100];

        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++) {
            tokens = br.readLine().split(" ");
            int from_left = Integer.parseInt(tokens[0]);
            int from_bottom = Integer.parseInt(tokens[1]);
            
            update(paper, from_left, from_bottom);
        }

        System.out.print(trueCount(paper));

    }

    public static int trueCount(boolean[][] paper) {
        int cnt = 0;
        for(int i = 0; i < paper.length; i++) {
            for(int j = 0; j < paper[i].length; j++) {
                if(paper[i][j]) cnt++;
            }
        }
        return cnt;
    }

    public static void update(boolean[][] paper, int from_left, int from_botton) {
        for(int i = from_left - 1; i < from_left + 9; i++) {
            for(int j = from_botton - 1; j < from_botton + 9; j++)
                paper[i][j] = true;
        }
    }

}
