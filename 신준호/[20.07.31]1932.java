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
        input = br.readLine();
        int[] values = new int[n];
        for(int i = 0; i < n; i++)
            values[i] = Integer.parseInt(br.readLine());

        Stack<Double> stack = new Stack<>();
        for(int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            switch(c) {
                case '*':
                    stack.push(stack.pop() * stack.pop());
                    break;
                case '/':
                    stack.push(Math.pow(stack.pop() / stack.pop(), -1));
                    break;
                case '+':
                    stack.push(stack.pop() + stack.pop());
                    break;
                case '-':
                    stack.push(- stack.pop() + stack.pop());
                    break;
                default:
                    stack.push( (double) values[c - 'A'] );
            }
        }

        System.out.printf("%.2f", stack.pop());

    }

}
