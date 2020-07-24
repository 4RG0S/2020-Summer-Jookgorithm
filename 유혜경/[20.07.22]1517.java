import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int[] a;
    static long sum = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine().trim());
        a = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine().trim(), " ");
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(st.nextToken());
        divide(0,n-1);
        System.out.println(sum);
    }
    public static void divide(int start, int end){
        if(start < end){
            int mid = (start+end)/2;
            divide(start, mid);
            divide(mid+1, end);
            sum += merge(start, end);
        }
    }
    public static long merge(int s, int e){
        long cnt = 0;
        int[] arr = new int[e-s+1];
        int m = (s+e)/2;
        int i = 0, left = s, right = m+1;
        while(left <= m && right <= e){
            if(a[left] <= a[right]){arr[i] = a[left]; i++; left++;}
            else{
                cnt+= m-left+1;
                arr[i] = a[right];
                i++;
                right++;
            }
        }
        while(left <= m) {arr[i] = a[left]; i++; left++;}
        while(right <= e) {arr[i] = a[right]; i++; right++;}
        for(int j = 0; j < arr.length; j++) a[s+j] = arr[j];
        return cnt;
    }
}