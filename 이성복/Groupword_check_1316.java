import java.util.Scanner;

public class Groupword_check_1316 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int tmp = input.nextInt();
		int count = 0;
		
		for(int i = 0; i < tmp; i++) {
			String str_tmp = input.next();
			char[] char_tmp = str_tmp.toCharArray();
			int flag = groupword_checker(char_tmp);
			if(flag == 1) {
				count++;
			}
		}
		System.out.println(count);
	}

	private static int groupword_checker(char[] tmp) {
		boolean check_num[] = new boolean[28];
		for(int i = 0; i < tmp.length; i++) {
			if(check_num[tmp[i] - 97] == false) {
				check_num[tmp[i] - 97] = true;
			} else if (check_num[tmp[i] - 97] == true && tmp[i - 1] != tmp[i]) {
				return 0;
			}
		}
		return 1;
	}

}
