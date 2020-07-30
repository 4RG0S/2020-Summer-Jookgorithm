import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine().trim());
        int cnt = 0;
        String str = "";
        for(int i = 0; i < n; i++) {
            str = br.readLine().trim();
            for(int j = 0; j < str.length(); j++){
                if(str.matches("[a-z]*["+str.charAt(j)+"]+[^"+str.charAt(j)+"]+["+str.charAt(j)+"]+[a-z]*")) {
                    cnt++;
                    break;
                }
            }
        }
        System.out.println(n - cnt);
    }
}