import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        HashMap<Integer, Integer> map = new HashMap<>();
        StringTokenizer st = null;

        HashMap<Integer, Integer> allmap = new HashMap<>();
        for(int i=0;i<20;i++){
            allmap.put(i+1, 1);
        }
        for(int i=0;i<n;i++){
            String input = br.readLine();
            st = new StringTokenizer(input);
            String problem = st.nextToken();
            int answer = 0;
            if(st.hasMoreTokens())
                answer = Integer.parseInt(st.nextToken());
            if(problem.equals("add")) map.put(answer, 1);
            else if(problem.equals("check")){
                if(map.containsKey(answer)) bw.write("1\n");
                else bw.write("0\n");
            }
            else if(problem.equals("remove"))
                map.remove(answer);
            else if(problem.equals("toggle")){
                if(map.containsKey(answer)) map.remove(answer);
                else map.put(answer, 1);
            }
            else if(problem.equals("empty")) map = new HashMap<>();
            else{
                map = allmap;
            }
        }
        br.close();
        bw.close();

    }


}