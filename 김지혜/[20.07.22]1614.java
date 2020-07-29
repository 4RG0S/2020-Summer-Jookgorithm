import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        BigInteger n = scan.nextBigInteger();
        BigInteger m = scan.nextBigInteger();

        BigInteger answer = BigInteger.ZERO;

        if(n.compareTo(BigInteger.ONE)==0)
            answer = n.add(m.multiply(BigInteger.valueOf(8))).subtract(BigInteger.ONE);
        else if(n.compareTo(BigInteger.valueOf(2))==0){
            if(m.mod(BigInteger.valueOf(2)).compareTo(BigInteger.ZERO)==0)
                answer = BigInteger.valueOf(2).add(BigInteger.valueOf(8)
                        .multiply((m.divide(BigInteger.valueOf(2)))))
                        .subtract(BigInteger.ONE);
                //System.out.println(2+8*(m/2)-1);
            else //System.out.println(8+8*((m-1)/2)-1);
                answer = BigInteger.valueOf(8).add(BigInteger.valueOf(8)
                    .multiply(m.subtract(BigInteger.ONE).divide(BigInteger.valueOf(2)))).subtract(BigInteger.ONE);
        }
        else if(n.equals(BigInteger.valueOf(3)))
            //System.out.println(3+4*m-1);
            answer = n.add(m.multiply(BigInteger.valueOf(4))).subtract(BigInteger.ONE);
        else if(n.equals(BigInteger.valueOf(4))){
            if(m.mod(BigInteger.valueOf(2)).equals(BigInteger.ZERO))
                //System.out.println(4+8*m/2-1);
                answer = n.add(BigInteger.valueOf(8).multiply(m.divide(BigInteger.valueOf(2))))
                        .subtract(BigInteger.ONE);
            else //System.out.println(6+8*((m-1)/2)-1);
                answer = BigInteger.valueOf(6).add((m.subtract(BigInteger.ONE)
                .divide(BigInteger.valueOf(2))).multiply(BigInteger.valueOf(8))).subtract(BigInteger.ONE);
        }
        else //System.out.println(n+8*m-1);
            answer = n.add(m.multiply(BigInteger.valueOf(8))).subtract(BigInteger.ONE);

        System.out.println(answer);

    }
}