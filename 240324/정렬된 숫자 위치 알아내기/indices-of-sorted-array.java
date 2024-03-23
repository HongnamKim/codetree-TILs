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

        for(int i = 0; i < n; i++){
            nums[i].afterIndex = i + 1;
        }

        Arrays.sort(nums, (a, b) -> a.index - b.index);

        for(int i = 0; i < n; i++){
            System.out.print(nums[i].afterIndex + " ");
        }

    }

    static class Num implements Comparable<Num>{
        public int num;
        public int index;
        public int afterIndex;

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
            return "num: " + num + " index: " + index + " after_index: " + afterIndex;
        }
    }
}