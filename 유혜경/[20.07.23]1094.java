import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int x;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        x = Integer.parseInt(br.readLine().trim());
        int len = 64, cnt = 0;
        while(x!=0){
            if(len > x) len = len / 2;
            else{
                x -= len;
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}