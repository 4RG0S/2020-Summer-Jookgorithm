import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("?´ëŠ ??ì»´í“¨?°ê³µ?™ê³¼ ?™ìƒ??? ëª…??êµìˆ˜?˜ì„ ì°¾ì•„ê°€ ë¬¼ì—ˆ??");
        recur(n, 0);
    }
    public static void recur(int n, int i) {
        if(n+1 == i) return;
        else {
            for(int j = 0; j < i; j++)
                System.out.print("____");
            System.out.println("\"?¬ê??¨ìˆ˜ê°€ ë­”ê???\"");
            if(i == n){
                for(int j = 0; j < i; j++)
                    System.out.print("____");
                System.out.println("\"?¬ê??¨ìˆ˜???ê¸° ?ì‹ ???¸ì¶œ?˜ëŠ” ?¨ìˆ˜?¼ë„¤\"");
            }
            else {
                for (int j = 0; j < i; j++)
                    System.out.print("____");
                System.out.println("\"???¤ì–´ë³´ê²Œ. ?›ë‚ ?›ë‚  ????ê¼??ê¸°ì— ?´ì„¸??ëª¨ë“  ì§€?ì„ ?µë‹¬??? ì¸???ˆì—ˆ??");
                for (int j = 0; j < i; j++)
                    System.out.print("____");
                System.out.println("ë§ˆì„ ?¬ëŒ?¤ì? ëª¨ë‘ ê·?? ì¸?ê²Œ ?˜ë§?€ ì§ˆë¬¸???ˆê³ , ëª¨ë‘ ì§€?œë¡­ê²??€?µí•´ ì£¼ì—ˆì§€.");
                for (int j = 0; j < i; j++)
                    System.out.print("____");
                System.out.println("ê·¸ì˜ ?µì? ?€ë¶€ë¶??³ì•˜?¤ê³  ?˜ë„¤. ê·¸ëŸ°???´ëŠ ?? ê·?? ì¸?ê²Œ ??? ë¹„ê°€ ì°¾ì•„?€??ë¬¼ì—ˆ??\"");
            }
            recur(n, i+1);
            for(int j = 0; j < i; j++)
                System.out.print("____");
            System.out.println("?¼ê³  ?µë??˜ì?ì§€.");
        }
    }
}