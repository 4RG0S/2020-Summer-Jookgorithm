import java.io.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main{

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        ArrayList<Integer> arr = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr.add(Integer.parseInt(st.nextToken()));
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Collections.sort(arr);
        bw.write(arr.get(m-1)+"\n");
        br.close();
        bw.close();
    }

}