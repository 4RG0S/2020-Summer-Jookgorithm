import org.omg.SendingContext.RunTime;

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

        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++) {
            tokens = br.readLine().split(" ");
            int n = Integer.parseInt(tokens[0]);
            int m = Integer.parseInt(tokens[1]);
            int cnt = 0;
            for(int j = n; j <= m; j++)
                cnt += cntZero(j);
            System.out.println(cnt);
        }


    }

    public static int cntZero(int n) {
        String str = Integer.toString(n);
        int cnt = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '0') cnt++;
        }
        return cnt;
    }

}
