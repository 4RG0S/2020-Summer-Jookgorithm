import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static class Student implements Comparable<Student>{
        String name;
        int korean;
        int english;
        int math;

        public Student(String name, int korean, int english, int math){
            this.name = name;
            this.korean = korean;
            this.english = english;
            this.math = math;
        }

        @Override
        public int compareTo(Student o) {
            if(this.korean>o.korean) return -1;
            else if(this.korean<o.korean) return 1;
            else{
                if(this.english>o.english) return 1;
                else if(this.english<o.english) return -1;
                else {
                    if(this.math>o.math) return -1;
                    else if(this.math<o.math) return 1;
                    else {
                        return this.name.compareTo(o.name);
                    }
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        PriorityQueue<Student> pq = new PriorityQueue<>();

        for(int i=0;i<n;i++){
            pq.add(new Student(scan.next(), scan.nextInt(), scan.nextInt(), scan.nextInt()));
        }
        while(!pq.isEmpty()){
            System.out.println(pq.poll().name);
        }

    }


}