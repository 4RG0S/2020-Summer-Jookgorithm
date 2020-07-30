import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class P10825 {
	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String arr[][] = new String[n][4];
		//[n][0]: 이름
		//[n][1]: 국어
		//[n][2]: 영어
		//[n][3]: 수학 점수
		
		for(int i=0; i<n; i++) {
			arr[i][0] = scan.next(); //이름
			arr[i][1] = scan.next(); //국
			arr[i][2] = scan.next(); //영
			arr[i][3] = scan.next(); //수
		}

		//국어 점수가 감소하는 순 -> 내림차순
		//국어 점수 == => 영어 점수 오름차순
		//국어 == 영어점수 -> 수학 점수 내림차순
		// 모든 점수 동일시 사전순으로 증가
		
		Arrays.sort(arr, new Comparator<String[]> () {

			@Override
			public int compare(String[] o1, String[] o2) {
				int o1_1 = Integer.parseInt(o1[1]);//국
				int o2_1 = Integer.parseInt(o2[1]);
				int o1_2 = Integer.parseInt(o1[2]);//영
				int o2_2 = Integer.parseInt(o2[2]);
				int o1_3 = Integer.parseInt(o1[3]);//수
				int o2_3 = Integer.parseInt(o2[3]);
				
				
				if(o1_1 == o2_1 && o1_2 == o2_2 && o1_3 == o2_3) {
					//모든 점수 동일 시 사전순
					return o1[0].compareTo(o2[0]);
				}
				if(o1_1 == o2_1 && o1_2 == o2_2) {
					//국어와 영어 점수 같으면 수학 점수 내림차순
					return Integer.compare(o2_3, o1_3);	
				}
				if(o1_1 == o2_1) {
					//국어 점수가 같을 경우 영어점수 오름차순
					return Integer.compare(o1_2, o2_2);	
				}
				//국어 점수가 감소하는 순
				return Integer.compare(o2_1, o1_1);	
			}
		});
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i][0]);
		}
	}
}
