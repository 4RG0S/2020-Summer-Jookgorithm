import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        String aStr = scan.nextLine();
        String bStr = scan.nextLine();

        int answer = 0;
        for(int i=0;i<aStr.length();i++){
            int tmpanswer = 0;
            StringBuilder tmp = new StringBuilder(aStr.substring(i));
            while(tmp.indexOf(bStr)!=-1){
                tmp = tmp.replace(tmp.indexOf(bStr), tmp.indexOf(bStr)+bStr.length(),"|");
                tmpanswer ++;
            }
            if(answer<tmpanswer) answer = tmpanswer;
        }
        System.out.println(answer);



    }


}