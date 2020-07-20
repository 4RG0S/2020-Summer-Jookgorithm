import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(),"\n");
        String pattern = "(100+1+|01)+";
        System.out.println(Pattern.matches(pattern, st.nextToken())?"SUBMARINE":"NOISE");
    }
}