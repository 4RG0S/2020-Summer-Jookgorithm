import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        List<String> arr = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            String s = scan.next();
            if (!arr.contains(s)) arr.add(s);
        }
        Collections.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()){
                    int i = 0;
                    while(o1.charAt(i) == o2.charAt(i)) i++;
                    return o1.charAt(i) - o2.charAt(i);
                }
                else return o1.length() - o2.length();
            }
        });
        for(int i = 0; i < arr.size(); i++)
            System.out.println(arr.get(i));
    }
}