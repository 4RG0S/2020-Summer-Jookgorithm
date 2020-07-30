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

        int x = Integer.parseInt(br.readLine());
        Stack<Integer> sticks = new Stack<>();
        sticks.push(64);

        while(!isPossible(sticks, x)) {
            int half = sticks.pop() / 2;

            if(!(sumOfSticks(sticks) + half >= x))
                sticks.push(half);
            sticks.push(half);
        }

        System.out.println(sticks.size());
    }

    public static boolean isPossible(List<Integer> sticks, int x) {
        return x == sumOfSticks(sticks);
    }

    public static int sumOfSticks(List<Integer> sticks) {
        int sum = 0;
        for(int i = 0; i < sticks.size(); i++)
            sum += sticks.get(i);
        return sum;
    }


}
