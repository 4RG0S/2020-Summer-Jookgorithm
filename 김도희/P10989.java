import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P10989 {
	public static void main (String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int arr[] = new int[10001];
		//이 문제는 sort를 사용하면 시간 초과가 난다
		
		for(int i=0; i<num; i++) {
			arr[Integer.parseInt(br.readLine())]++;
		}
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i=0; i<10000; i++) {
				while(0 < arr[i]--) {
					bw.write(Integer.toString(i) + "\n");
				}
		}
		
		br.close();
		bw.close();
		
	}
}
