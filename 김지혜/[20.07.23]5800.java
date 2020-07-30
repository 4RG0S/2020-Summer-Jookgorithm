import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for(int i=0;i<n;i++){
            int m = scan.nextInt();
            System.out.println("Class "+(i+1));
            int a[] = new int[m];
            for(int j=0;j<m;j++){
                a[j] = scan.nextInt();
            }
            Arrays.sort(a);
            int maxGap = 0;
            for(int j=1;j<m;j++){
                if(maxGap<a[j]-a[j-1])
                    maxGap = a[j]-a[j-1];
            }
            System.out.println("Max "+a[m-1]+", Min "+a[0]+", Largest gap "+maxGap);


        }


    }
}