import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int x = sc.nextInt();
        Arrays.sort(arr);
        int start = 0; int end = n-1;
        int cnt = 0;
        while(true){
            if(start >= end) break;
            else if(arr[start] + arr[end] == x) {
                cnt++; start++; end--;
            }
            else if(arr[start] + arr[end] < x) start++;
            else end--;
        }
        System.out.println(cnt);
    }
}