import com.sun.org.apache.xerces.internal.xinclude.XPointerElementHandler;

import java.io.BufferedReader;
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

        input = br.readLine();
        int n = Integer.parseInt(br.readLine());
        String[] dict = new String[n];
        for(int i = 0; i < n; i++)
            dict[i] = br.readLine();

        for(int i = 0; i < 26; i++) {
            String text = decrypt(input, i);
            if(contains(text, dict)) {
                System.out.println(text);
                break;
            }
        }

    }

    public static String decrypt(String cipher, int n) {
        StringBuffer stringBuffer = new StringBuffer();
        for(int i = 0; i < cipher.length(); i++)
            stringBuffer.append( (char) ((cipher.charAt(i) - 'A' + n) % 26 + 'a') );
        return stringBuffer.toString();
    }

    public static boolean contains(String text, String[] dict) {
        for(int i = 0; i < dict.length; i++) {
            if(text.contains(dict[i])) return true;
        }
        return false;
    }

}
