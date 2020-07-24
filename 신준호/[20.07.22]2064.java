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
        String[] addresses = new String[n];
        for(int i = 0; i < n; i++) {
            tokens = br.readLine().split("\\.");
            addresses[i] = decAddrToBinary(tokens);
        }

        int boundarybit = 0;
        for(; boundarybit < addresses[0].length(); boundarybit++) {
            if(!isSameAtIdx(addresses, boundarybit)) break;
        }

        StringBuffer stringBuffer = new StringBuffer();
        for(int i = 0; i < addresses[0].length(); i++) {
            if(i % 9 == 8)              stringBuffer.append(".");
            else if(i < boundarybit)    stringBuffer.append("1");
            else                        stringBuffer.append("0");
        }

        String[] netmask = stringBuffer.toString().split("\\.");
        String[] netaddr = addresses[0].split("\\.");
        StringBuffer netmask_out = new StringBuffer();
        StringBuffer netaddr_out = new StringBuffer();
        for(int i = 0; i < netmask.length; i++) {
            int mask_part = Integer.parseInt(netmask[i], 2);
            int addr_part = Integer.parseInt(netaddr[i], 2);

            addr_part = addr_part & mask_part;
            netaddr_out.append(addr_part + ".");
            netmask_out.append(mask_part + ".");
        }

        netaddr_out.deleteCharAt(netaddr_out.length() - 1);
        netmask_out.deleteCharAt(netmask_out.length() - 1);

        System.out.println(netaddr_out);
        System.out.println(netmask_out);


    }

    public static String decAddrToBinary(String[] tokens) {
        StringBuffer stringBuffer = new StringBuffer();
        for(int j = 0; j < tokens.length; j++) {
            String binary = Integer.toBinaryString(Integer.parseInt(tokens[j]));
            for(int k = 0; k < 8-binary.length(); k++)
                stringBuffer.append("0");
            stringBuffer.append(binary + ".");
        }
        stringBuffer.deleteCharAt(stringBuffer.length() - 1);

        return stringBuffer.toString();
    }

    public static boolean isSameAtIdx(String[] addresses, int idx) {
        char criteria = addresses[0].charAt(idx);
        for(int i = 1; i < addresses.length; i++) {
            if(addresses[i].charAt(idx) != criteria) return false;
        }
        return true;
    }

}

