import jdk.nashorn.internal.parser.Scanner;

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
        Node[] tree = new Node[n];
        for(int i = 0; i < n; i++)
            tree[i] = new Node(i);

        for(int i = 1; i < n; i++){
            tokens = br.readLine().split(" ");
            int parent = Integer.parseInt(tokens[0]) - 1;
            int child = Integer.parseInt(tokens[1]) - 1;
            int weight = Integer.parseInt(tokens[2]);

            tree[parent].putChild(tree[child], weight);
        }

        int[] maxAt = new int[n];
        Node.findDiameter(tree[0], maxAt);
        Arrays.sort(maxAt);
        System.out.println(maxAt[maxAt.length-1]);

    }

    public static class Node {
        int id;
        List<Node> childs = new ArrayList<>();
        List<Integer> weights = new ArrayList<>();

        Node(int id) {
            this.id = id;
            this.childs = new ArrayList<>();
            this.weights = new ArrayList<>();
        }

        void putChild(Node child, int weight) {
            this.childs.add(child);
            this.weights.add(weight);
        }

        static int findDiameter(Node node, int[] maxAt) {
            ArrayList<Integer> depths = new ArrayList<>();

            for(int i = 0; i < node.childs.size(); i++) {
                depths.add( findDiameter(node.childs.get(i), maxAt) + node.weights.get(i) );
            }

            depths.sort(Comparator.reverseOrder());

            if(depths.size() == 0) return 0;

            if(depths.size() == 1)
                maxAt[node.id] = depths.get(0);
            else
                maxAt[node.id] = depths.get(0) + depths.get(1);
            return depths.get(0);
        }
    }


}