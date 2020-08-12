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
        int m = Integer.parseInt(tokens[1]);

        int[] scores = new int[n];
        tokens = br.readLine().split(" ");
        for(int i = 0; i < scores.length; i++)
            scores[i] = Integer.parseInt(tokens[i]);

        Student[] students = new Student[m];
        for(int i = 0; i < m; i++) {
            tokens = br.readLine().split(" ");

            int id = Integer.parseInt(tokens[0]);
            int score = 0;
            for(int j = 1; j < tokens.length; j++) {
                if(tokens[j].equals("O")) score += scores[j-1];
            }

            students[i] = new Student(id, score);
        }

        Arrays.sort(students, (o1, o2) -> {
            if(o1.score < o2.score)
                return 1;
            else if(o1.score > o2.score)
                return -1;
            else {
                if(o1.id > o2.id)
                    return 1;
                else if(o1.id < o2.id)
                    return -1;
                else
                    return 0;
            }
        });

        System.out.println(students[0].id + " " + students[0].score);

    }

    public static class Student {
        int id;
        int score;

        Student(int id, int score) {
            this.id = id;
            this.score = score;
        }
    }


}
