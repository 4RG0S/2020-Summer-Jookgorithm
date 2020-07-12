import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class P2751 {
	public static void main (String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for(int i=0; i<num; i++) {
			arr.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(arr);
		
		for(int i=0; i<num; i++) {
			System.out.println(arr.get(i));
		}
	}
}
