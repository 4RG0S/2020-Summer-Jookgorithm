import java.io.IOException;
import java.util.*;

public class Main{

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Map<String, Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){
            String input = scan.next();
            if(map.isEmpty()) map.put(input, 1);
            else{
                Set keySet = map.keySet();
                Iterator iter = keySet.iterator();

                boolean isSame = false;
                while(iter.hasNext()){
                    String key = (String) iter.next();
                    if(isSame(key, input)){
                        isSame = true;
                        break;
                    }
                }
                if(!isSame) map.put(input, 1);
            }
        }
        System.out.println(map.size());
    }
    public static boolean isSame(String aStr, String bStr){

        if(aStr.length() != bStr.length()) return false;
        if(aStr.equals(bStr)) return true;

        StringBuilder sb = new StringBuilder(aStr);
        for(int i=0;i<aStr.length();i++){

            if(bStr.equals(sb.toString())) return true;
            else sb.append(sb.charAt(0)).deleteCharAt(0);
        }
        return false;
    }

}