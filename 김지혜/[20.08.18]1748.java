import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int answer = 0;

        int nine = 9;
        int i = 1;
        while(true){
            if(n>nine){
                answer = answer + (int) (Math.pow(10, i-1)*9)*i;
            }
            else{
                answer = answer + ((int) (n-Math.pow(10, i-1))+1)*i;
                break;
            }
            nine = nine + (int) (Math.pow(10, i)*9);
            i++;
        }
        System.out.println(answer);
    }

}
