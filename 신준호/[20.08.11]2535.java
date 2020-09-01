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

        int n = Integer.parseInt(br.readLine());
        Participant[] participants = new Participant[n];
        for(int i = 0; i < n; i++) {
            tokens = br.readLine().split(" ");
            int country = Integer.parseInt(tokens[0]);
            int id = Integer.parseInt(tokens[1]);
            int score = Integer.parseInt(tokens[2]);
            participants[i] = new Participant(country, id, score);
        }

        Arrays.sort(participants, (o1, o2) -> {
            if(o1.score < o2.score)
                return 1;
            else if(o1.score > o2.score)
                return -1;
            else
                return 0;
        });

        System.out.println(participants[0].country + " " + participants[0].id);
        int country = participants[0].country;
        int cnt = 1;
        int idx = 1;
        while(cnt < 3) {
            if(cnt == 1) {
                System.out.println(participants[idx].country + " " + participants[idx].id);
                idx++;
                cnt++;
            }
            else {
                if(participants[idx].country == country)
                    idx++;
                else {
                    System.out.println(participants[idx].country + " " + participants[idx].id);
                    cnt++;
                }
            }
        }

    }

    public static class Participant {
        int country;
        int id;
        int score;

        Participant(int country, int id, int score) {
            this.country = country;
            this.id = id;
            this.score = score;
        }

    }

}
