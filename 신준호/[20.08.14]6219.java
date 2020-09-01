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
        int A = Integer.parseInt(tokens[0]);
        int B = Integer.parseInt(tokens[1]);
        String D = tokens[2];

        boolean[] eratos = eratos(4000001);

        int cnt = 0;
        for(int i = A; i <= B; i++) {
            if(eratos[i]) {
                String prime = Integer.toString(i);
                if(prime.contains(D)) cnt++;
            }
        }

        System.out.println(cnt);

    }

    public static boolean[] eratos(int n) {
        boolean[] eratos = new boolean[n];
        Arrays.fill(eratos, true);
        eratos[0] = false; eratos[1] = false;
        for(int i = 2; i < eratos.length; i++) {
            if(eratos[i]) {
                for(int j = i * 2; j < eratos.length; j += i) eratos[j] = false;
            }
        }
        return eratos;
    }

}
