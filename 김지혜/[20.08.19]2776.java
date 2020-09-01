import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        BufferedWriter bw  = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i=0;i<n;i++){
            HashMap<Integer, Integer> hashMap = new HashMap<>();
            int a = Integer.parseInt(br.readLine());
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input);
            for(int j=0;j<a;j++){
                hashMap.put(Integer.parseInt(st.nextToken()), 1);
            }
            int b = Integer.parseInt(br.readLine());
            input = br.readLine();
            st = new StringTokenizer(input);
            for(int j=0;j<b;j++){
                if(hashMap.containsKey(Integer.parseInt(st.nextToken()))) bw.write("1\n");
                else bw.write("0\n");
            }
        }
        br.close();
        bw.close();

    }

}
