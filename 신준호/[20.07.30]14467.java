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

        //input = br.readLine();
        //tokens = input.split(" ");

        int n = Integer.parseInt(br.readLine());
        Map<String, String> map = new HashMap<>();
        int cnt = 0;
        for(int i = 0; i < n; i++) {
            tokens = br.readLine().split(" ");
            if(map.containsKey(tokens[0])) {
                if(!map.get(tokens[0]).equals(tokens[1])) {
                    map.put(tokens[0], tokens[1]);
                    cnt++;
                }
            }
            else {
                map.put(tokens[0], tokens[1]);
            }
        }

        System.out.println(cnt);

    }

}
