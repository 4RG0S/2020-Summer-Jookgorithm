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
        tokens = br.readLine().split(" ");
        boolean[] isExist = new boolean[2001];
        for(int i = 0; i < n; i++)
            isExist[Integer.parseInt(tokens[i]) + 1000] = true;

        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < isExist.length; i++) {
            if(isExist[i]) list.add(i - 1000);
        }

        Collections.sort(list);
        for(int i = 0; i < list.size(); i++)
            System.out.print(list.get(i) + " ");


    }

}

