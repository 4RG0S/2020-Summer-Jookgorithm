import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("?ด๋ ??์ปดํจ?ฐ๊ณต?๊ณผ ?์??? ๋ช??๊ต์?์ ์ฐพ์๊ฐ ๋ฌผ์??");
        recur(n, 0);
    }
    public static void recur(int n, int i) {
        if(n+1 == i) return;
        else {
            for(int j = 0; j < i; j++)
                System.out.print("____");
            System.out.println("\"?ฌ๊??จ์๊ฐ ๋ญ๊???\"");
            if(i == n){
                for(int j = 0; j < i; j++)
                    System.out.print("____");
                System.out.println("\"?ฌ๊??จ์???๊ธฐ ?์ ???ธ์ถ?๋ ?จ์?ผ๋ค\"");
            }
            else {
                for (int j = 0; j < i; j++)
                    System.out.print("____");
                System.out.println("\"???ค์ด๋ณด๊ฒ. ?๋ ?๋  ????๊ผ??๊ธฐ์ ?ด์ธ??๋ชจ๋  ์ง?์ ?ต๋ฌ??? ์ธ???์??");
                for (int j = 0; j < i; j++)
                    System.out.print("____");
                System.out.println("๋ง์ ?ฌ๋?ค์? ๋ชจ๋ ๊ท?? ์ธ?๊ฒ ?๋ง? ์ง๋ฌธ???๊ณ , ๋ชจ๋ ์ง?๋กญ๊ฒ???ตํด ์ฃผ์์ง.");
                for (int j = 0; j < i; j++)
                    System.out.print("____");
                System.out.println("๊ทธ์ ?ต์? ?๋ถ๋ถ??ณ์?ค๊ณ  ?๋ค. ๊ทธ๋ฐ???ด๋ ?? ๊ท?? ์ธ?๊ฒ ??? ๋น๊ฐ ์ฐพ์???๋ฌผ์??\"");
            }
            recur(n, i+1);
            for(int j = 0; j < i; j++)
                System.out.print("____");
            System.out.println("?ผ๊ณ  ?ต๋??์?์ง.");
        }
    }
}