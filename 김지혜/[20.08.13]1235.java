import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        String[] input = new String[n];
        for(int i=0;i<n;i++){
            input[i] = scan.next();
        }
        int k = 1;
        int length = input[0].length();
        Map<String, Integer> map = new HashMap<String, Integer>();
        while(k<=length){
            boolean find = true;
            String temp = input[0].substring(length-k);
            map.put(temp, 1);
            for(int i=1;i<n;i++){
                if(map.containsKey(input[i].substring(length-k))){
                    find = false;
                    break;
                }
                else{
                    map.put(input[i].substring(length-k), 1);
                }
            }
            if(find){
                System.out.println(k);
                break;
            }
            else{
                map = new HashMap<>();
                k++;
            }
        }

    }


}