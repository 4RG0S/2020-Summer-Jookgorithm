import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P11652_2 {
	public static void main (String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		long arr[] = new long[num];
		
		for(int i=0; i<num; i++) {
			arr[i] = Long.parseLong(br.readLine());
		}
		
		Arrays.sort(arr); //오름차순으로 정렬
		int cnt = 1, Max = 1;
		long compare = arr[0];
		for(int j=1; j<num; j++) {
			//정렬해놓고, 수 세기 (같을 경우 앞에 있는 수가 그대로 유지)
			if(arr[j-1] == arr[j]) {
				//그 전것과 같다면
				++cnt;
			}
			else {
				//다른 숫자가 나타났다면
				cnt = 1;
			}
			//숫자가 max보다 큰지
			if(Max < cnt) {
				compare = arr[j];
				Max = cnt;
			}
		}
		
		System.out.println(compare);
	}
}
