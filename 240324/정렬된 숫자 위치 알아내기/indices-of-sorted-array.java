import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Num[] nums = new Num[n];

        for(int i = 0; i < n; i++){
            nums[i] = new Num(sc.nextInt(), i+1);
        }


        Arrays.sort(nums);

        int[] answers = new int[n];

        for(int i = 0; i < n; i++){
            answers[nums[i].index-1] = i + 1;
        }

        for(int i = 0; i < n; i++){
            System.out.print(answers[i] + " ");
        }

    }

    static class Num implements Comparable<Num>{
        public int num;
        public int index;
        public Num (int num, int index){
            this.num = num;
            this.index = index;
        }

        @Override
        public int compareTo(Num o) {
            return this.num - o.num;
        }

        @Override
        public String toString() {
            return "num: " + num + " index: " + index;
        }
    }
}