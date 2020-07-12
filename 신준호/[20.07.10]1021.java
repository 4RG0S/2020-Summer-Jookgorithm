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

        tokens = br.readLine().split(" ");
        int n, m;
        n = Integer.parseInt(tokens[0]);
        m = Integer.parseInt(tokens[1]);

        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++)
            list.add(i);

        tokens = br.readLine().split(" ");
        int idx = 0;
        int cnt = 0;
        for(int i = 0; i < m; i++) {
            int target = Integer.parseInt(tokens[i]) - 1;
            int nextIdx = list.indexOf(target);
            int diff = Math.abs(nextIdx - idx);
            cnt += Math.min(diff, list.size() - diff);

            list.remove(nextIdx);

            if(nextIdx == list.size()) idx = 0;
            else idx = nextIdx;

        }

        System.out.println(cnt);

    }

}

