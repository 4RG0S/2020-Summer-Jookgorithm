import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

    public static class Score implements Comparable<Score> {
        int score;
        int num;

        public Score(int score, int num){
            this.score=score;
            this.num=num;
        }

        @Override
        public int compareTo(Score o) {
            if(this.score>o.score) return -1;
            else if(this.score<o.score) return 1;
            else{
                if(this.num<o.num) return -1;
                else if(this.num>o.num) return 1;
                else return 0;
            }
        }
    }
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);

        PriorityQueue<Score> pq = new PriorityQueue<>();

        for(int i=0;i<8;i++){
            pq.add(new Score(scan.nextInt(), i+1));
        }
        PriorityQueue<Integer> numpq = new PriorityQueue<>();
        int sum = 0;
        for(int i=0;i<5;i++){
            Score curScore = pq.poll();
            sum = sum + curScore.score;
            numpq.add(curScore.num);
        }
        System.out.println(sum);
        while(!numpq.isEmpty())
            System.out.print(numpq.poll()+" ");
    }

}