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

        List<KeyboardInput> inputList = new ArrayList<>();
        for(int i = 0; i < m; i++) {
            tokens = br.readLine().split(" ");
            int id = Integer.parseInt(tokens[0]);
            int time = Integer.parseInt(tokens[1]);
            String KInput = tokens[2];

            inputList.add(new KeyboardInput(id, time, KInput));
        }

        Collections.sort(inputList, new Comparator<KeyboardInput>() {
            @Override
            public int compare(KeyboardInput o1, KeyboardInput o2) {
                if(o1.time > o2.time)
                    return 1;
                else if (o1.time < o2.time)
                    return -1;
                else {
                    if(o1.id > o2.id)
                        return 1;
                    else
                        return -1;
                }
            }
        });

        for(int i = 0; i < inputList.size(); i++)
            System.out.print(inputList.get(i).input);

    }

    public static class KeyboardInput {
        int id;
        int time;
        String input;

        KeyboardInput(int id, int time, String input) {
            this.id = id;
            this.time = time;
            this.input = input;
        }

    }

}
