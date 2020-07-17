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

        int n = Integer.parseInt(br.readLine());
        List<Node> tree = new ArrayList<>();
        for(int i  = 0; i < n; i++)
            tree.add(new Node(i));

        for(int i = 0; i < n; i++) {
            tokens = br.readLine().split(" ");
            int id = Integer.parseInt(tokens[0]) - 1;
            for(int j = 1; !tokens[j].equals("-1"); j += 2) {
                tree.get(id).neighbors.add(tree.get(Integer.parseInt(tokens[j]) - 1));
                tree.get(id).weights.add(Integer.parseInt(tokens[j+1]));
            }
        }

        Ret ret = dfs(tree.get(0), new boolean[n]);
        ret = dfs(tree.get(ret.id), new boolean[n]);
        System.out.println(ret.len);

    }

    public static Ret dfs(Node node, boolean[] visited) {

        int max = 0;
        int id = node.id;

        for(int i = 0; i < node.neighbors.size(); i++) {
            if(visited[node.neighbors.get(i).id]) continue;

            visited[node.id] = true;
            Ret ret = dfs(node.neighbors.get(i), visited);
            visited[node.id] = false;

            if(ret.len + node.weights.get(i) > max) {
                max = ret.len + node.weights.get(i);
                id = ret.id;
            }
        }

        return new Ret(id, max);
    }

    public static class Ret {
        int id;
        int len;

        Ret(int id, int len) {
            this.id = id;
            this.len = len;
        }
    }

    public static class Node {
        int id;
        List<Node> neighbors;
        List<Integer> weights;

        Node(int id) {
            this.id = id;
            this.neighbors = new ArrayList<>();
            this.weights = new ArrayList<>();
        }

    }

}

