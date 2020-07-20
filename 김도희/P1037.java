import java.util.Arrays;
import java.util.Scanner;

public class P1037 {	
	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int arr[] = new int[num];
		
		for(int i=0; i<num; i++) {
			arr[i] = scan.nextInt();
		}
		
		int min, max;
		Arrays.sort(arr);
		min = arr[0];
		max = arr[num-1];
		
		int fin = min*max;
		
		System.out.println(fin);
		
	}

}
