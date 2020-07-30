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

        int scenario = 1;
        while(!(input = br.readLine()).equals("0")) {
            int n = Integer.parseInt(input);
            Student[] students = new Student[n];

            for(int i = 0; i < n; i++) {
                students[i] = new Student(br.readLine());
            }

            for(int i = 0; i < 2*n -1; i++) {
                tokens = br.readLine().split(" ");
                students[Integer.parseInt(tokens[0]) - 1].cnt++;
            }

            for(int i = 0; i < n; i++) {
                if (students[i].cnt == 1) {
                    System.out.println(scenario++ + " " + students[i].name);
                    break;
                }
            }

        }

    }

    public static class Student {
        String name;
        int cnt;

        Student(String name) {
            this.name = name;
            this.cnt = 0;
        }
    }
}
