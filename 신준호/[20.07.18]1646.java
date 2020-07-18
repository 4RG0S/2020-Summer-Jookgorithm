import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
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
        int n;
        long v1, v2;
        n = Integer.parseInt(tokens[0]);
        v1 = Long.parseLong(tokens[1]);
        v2 = Long.parseLong(tokens[2]);

        long[] fibo = new long[51];
        fibo[0] = 1; fibo[1] = 1;
        for(int i = 2; i < fibo.length; i++)
            fibo[i] = fibo[i-1] + fibo[i-2];

        long[] tree = new long[51];
        tree[0] = 1; tree[1] = 1;
        for(int i = 2; i < tree.length; i++)
            tree[i] = fibo[i] * 2 - 1;

        StringBuffer path1 = new StringBuffer();
        pathFind(path1, tree, n, v1);

        StringBuffer path2 = new StringBuffer();
        pathFind(path2, tree, n, v2);

        int idx = 0;
        for(; idx < path1.length(); idx++) {
            if(path1.charAt(idx) != path2.charAt(idx)) break;
        }

        StringBuffer path = new StringBuffer();
        for(int i = idx; i < path1.length(); i++)
            path.append("U");
        path.append(path2.substring(idx));

        System.out.println(path);
    }

    public static void pathFind(StringBuffer path, long[] tree, int idx, long target) {

        if(target == 0 || target == 1) return;

        if(tree[idx-2] + 1 < target) pathFind(path.append("R"), tree, idx-1, target - tree[idx - 2] - 1);
        else pathFind(path.append("L"), tree, idx-2, target - 1);
    }

}

