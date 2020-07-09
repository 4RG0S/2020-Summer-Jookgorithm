import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int array[] = new int[num];
		Integer[] finArray = new Integer[num];
		int std = -1; //기준 인덱스
		int number;
		
		for(int i=0; i<num; i++) {
			number = scan.nextInt();
			array[i] = number;
			finArray[i] = number;
		}
		
		//마지막 배열
		Arrays.sort(finArray, Collections.reverseOrder());
		
		int isFinal = 1;
		//마지막 배열인지 검사
		for(int k=0; k<num; k++) {
			if(array[k] != finArray[k]) {
				isFinal = 0;
			}
		}
		
		if(isFinal == 1) {
			//마지막이라면
			System.out.println(-1);
		}
		else {
			//뒤에서부터 검사, 기준 인덱스 찾기
			for(int n=num-1; n>0; n--) {
				if(array[n-1] < array[n] && std == -1) {
					//뒤에거가 더 크면, 기준 값이 없다면
					std = n;
				}
			}
			
			int change = 0;
			//기준 인덱스 기준으로
			for(int index=num-1; index>=std; index--) {
					for(int stand= std-1; stand>=0; stand--) {
						if(array[stand] < array[index] && change == 0) {
							//큰 것을 발견했을 경우에 자리 바꿔주기
							int temp = array[index];
							array[index] = array[stand];
							array[stand] = temp;
							change = 1;
						}
				}
			}
			
			//그 기준으로 오름차순 정렬
			//Arrays.sort(array, std, num);
			 int start = std;
		     int end = num - 1;
		        while(start < end) {
		            int tmp = array[start];
		            array[start] = array[end];
		            array[end] = tmp;
		            start++;
		            end--;
		       }
			
			for(int i=0; i<num; i++) {
				System.out.print(array[i] + " ");
			}
		}
	}
}
