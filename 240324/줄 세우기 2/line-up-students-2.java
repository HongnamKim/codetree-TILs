import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Student[] students = new Student[n];

        for(int i = 0; i < n; i++){
            students[i] = new Student(sc.nextInt(), sc.nextInt(), i+1);
        }

        Arrays.sort(students);

        for(int i = 0; i < n; i++){
            System.out.println(students[i].toString());
        }
    }

    static class Student implements Comparable<Student>{
        public int height;
        public int weight;
        public int code;

        public Student(int height, int weight, int code) {
            this.height = height;
            this.weight = weight;
            this.code = code;
        }

        @Override
        public int compareTo(Student o) {
            if(this.height == o.height){
                return o.weight - this.weight;
            }
            return this.height - o.height;
        }

        @Override
        public String toString(){
            return height + " " + weight + " " + code;
        }
    }
}