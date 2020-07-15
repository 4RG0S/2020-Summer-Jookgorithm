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

        while(!(input = br.readLine()).equals("0")) {
            int n = Integer.parseInt(input);
            List<String> list = new ArrayList<>();
            for(int i = 0; i < n; i++)
                list.add(br.readLine());
            Collections.sort(list, Comparator.comparing(String::toLowerCase));
            System.out.println(list.get(0));
        }

    }


}
