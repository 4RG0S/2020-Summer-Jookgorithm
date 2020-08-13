import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        BigInteger[] f = new BigInteger[n+2];
        f[0] = BigInteger.ZERO; f[1] = BigInteger.ONE;
        for(int i = 2; i <= n; i++)
            f[i] = f[i-1].add(f[i-2]);
        System.out.println(f[n]);
    }
}