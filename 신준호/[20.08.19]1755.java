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

        tokens = br.readLine().split(" ");

        int m = Integer.parseInt(tokens[0]);
        int n = Integer.parseInt(tokens[1]);
        Unit[] nums = new Unit[n - m + 1];

        for(int i = m; i <= n; i++)
            nums[i - m] = new Unit(integerToString(i), i);

        Arrays.sort(nums, Comparator.comparing(o -> o.inStr));

        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i].inInt + " ");
            if((i + 1) % 10 == 0) System.out.println();
        }

    }

    public static String integerToString(int n) {
        StringBuffer stringBuffer = new StringBuffer();

        int ten = n / 10;
        int one = n % 10;

        if(ten != 0)
            stringBuffer.append(transform(ten)).append(" ");
        stringBuffer.append(transform(one));

        return stringBuffer.toString();
    }

    public static String transform(int n) {
        switch (n) {
            case 0:
                return "zero";
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
        }
        return null;
    }

    public static class Unit {
        String inStr;
        int inInt;

        Unit(String inStr, int inInt) {
            this.inStr = inStr;
            this.inInt = inInt;
        }
    }


}
