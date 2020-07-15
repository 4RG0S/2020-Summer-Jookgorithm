import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        String[] tokens;

        input = br.readLine();
        //tokens = input.split(" ");

        int cnt = 0;
        while(input.length() != 1) {
            int sum = 0;
            for(int i = 0; i < input.length(); i++)
                sum += Integer.parseInt(input.substring(i, i+1));
            input = Integer.toString(sum);
            cnt++;
        }

        System.out.println(cnt);
        if(Integer.parseInt(input) % 3 == 0) System.out.println("YES");
        else System.out.println("NO");

    }


}
