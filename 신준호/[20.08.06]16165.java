import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static long[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        String[] tokens;

        //input = br.readLine();
        //tokens = input.split(" ");

        tokens = br.readLine().split(" ");
        int n = Integer.parseInt(tokens[0]);
        int m = Integer.parseInt(tokens[1]);

        Map<String, String> map = new HashMap<>();
        Map<String, List<String>> groups = new HashMap<>();
        for(int i = 0; i < n; i++) {
            String group = br.readLine();
            groups.put(group, new ArrayList<>());

            int members = Integer.parseInt(br.readLine());
            for(int j = 0; j < members; j++) {
                String member = br.readLine();
                map.put(member, group);
                groups.get(group).add(member);
            }
        }

        for( String group : groups.keySet() ) {
            Collections.sort(groups.get(group));
        }

        for(int i = 0; i < m; i++) {
            String name = br.readLine();
            String type = br.readLine();
            if(type.equals("0")) {
                List<String> list = groups.get(name);
                for(String memberName : list)
                    System.out.println(memberName);
            }
            else {
                System.out.println(map.get(name));

            }
        }


    }

}
