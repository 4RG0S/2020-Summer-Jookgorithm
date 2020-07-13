import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack l_stack = new Stack();
        Stack r_stack = new Stack();
        String s = br.readLine().trim();
        for(int i = 0; i < s.length(); i++)
            l_stack.add(i, s.charAt(i));
        StringTokenizer st = new StringTokenizer(br.readLine(),"\n");
        int m = Integer.parseInt(st.nextToken());
        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine(), " ");
            String s1 = st.nextToken();
            switch (s1){
                case "L":
                    if(!l_stack.isEmpty())
                        r_stack.push(l_stack.pop());
                    break;
                case "D":
                    if(!r_stack.isEmpty())
                        l_stack.push(r_stack.pop());
                    break;
                case "B":
                    if(!l_stack.isEmpty())
                        l_stack.pop();
                    break;
                case "P":
                    l_stack.push(st.nextToken());
                    break;
            }
        }
        while(!l_stack.isEmpty()) {
            r_stack.push(l_stack.pop());
        }
        while(!r_stack.isEmpty())
            System.out.print(r_stack.pop());
    }
}