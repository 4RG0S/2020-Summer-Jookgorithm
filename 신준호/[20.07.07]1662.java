import jdk.nashorn.internal.parser.Scanner;

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

        input = br.readLine();
        //tokens = input.split(" ");

        Stack<Integer> repeat = new Stack<>();
        Stack<Integer> checkPoint = new Stack<>();
        int len = 0;

        for(int i = 0; i < input.length(); i++) {
            String c = input.substring(i, i+1);
            if(c.equals("(")) {
                repeat.push(Integer.parseInt(input.substring(i-1, i)));
                checkPoint.push(--len);
                len = 0;
            }
            else if(c.equals(")")) 
                len = checkPoint.pop() + (repeat.pop() * len);
            else 
                len++;
        }

        System.out.println(len);

    }


}