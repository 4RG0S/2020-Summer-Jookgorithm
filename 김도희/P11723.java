import java.util.Arrays;
import java.util.Scanner;

public class P11723 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder ans = new StringBuilder();

        int M = sc.nextInt();
        boolean[] set = new boolean[21];
        for (int i = 0; i < M; i++) {
            switch (sc.next()) {
            case "add":
                set[sc.nextInt()] = true;
                break;
            case "remove":
                set[sc.nextInt()] = false;
                break;
            case "check":
                if (set[sc.nextInt()])
                    ans.append("1\n");
                else
                    ans.append("0\n");
                break;
            case "toggle":
                int tmp = sc.nextInt();
                set[tmp] = !set[tmp];
                break;
            case "all":
                Arrays.fill(set, true);
                break;
            case "empty":
                Arrays.fill(set, false);
                break;
            }
        }
         System.out.println(ans);
    }
}