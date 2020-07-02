import java.util.*;

public class Main {
    static Stack<Integer> st = new Stack<Integer>();
    static int n, m;
    static int[] crane;
    static ArrayList<Integer> box = new ArrayList<Integer>();
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        crane = new int[n];
        for(int i = 0; i < n; i++)
            crane[i] = scan.nextInt();
        m = scan.nextInt();
        for(int i = 0; i < m; i++)
            box.add(i, scan.nextInt());
        Arrays.sort(crane);
        Collections.sort(box);
        System.out.println(movetime());
    }
    public static int movetime(){
        int cnt = 0;
        if(crane[n-1] < box.get(m-1)) return -1;
        int j = m-1;
        while(true){
            cnt++;
            for(int i = n-1; i >= 0; i--){
                if(box.isEmpty()||j < 0) break;
                if(crane[i] < box.get(j))i++;
                else box.remove(j);
                j--;
            }
            if(box.isEmpty()) break;
            j = box.size()-1;
        }
        return cnt;
    }
}