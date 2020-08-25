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

        tokens = br.readLine().split(" ");
        int n = Integer.parseInt(tokens[0]);
        int d = Integer.parseInt(tokens[1]);

        StringBuffer stringBuffer = new StringBuffer();
        for(int i = 1; i <= n; i++)
            stringBuffer.append(i);

        int[] bin = new int[10];
        for(int i = 0; i < stringBuffer.length(); i++)
            bin[stringBuffer.charAt(i) - '0']++;

        System.out.println(bin[d]);
    }

}
