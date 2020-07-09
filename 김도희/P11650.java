
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class P11650 {
	public static void main (String args[]) throws NumberFormatException, IOException {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int arr[][] = new int[num][2];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		//ÀçÁ¤ÀÇ
		Arrays.sort(arr, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				
				if(o1[0] == o2[0]) {
					return Integer.compare(o1[1], o2[1]);
				}
				return Integer.compare(o1[0], o2[0]);
			}
			
		});
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i][0] + " " + arr[i][1]);
		}
	}
}
