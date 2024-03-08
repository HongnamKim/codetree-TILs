import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < nums.length; i++){
            nums[i] = sc.nextInt();
        }

        absNums(nums);
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }

    public static void absNums(int[] nums){
        for(int i = 0; i < nums.length; i++){
            nums[i] = Math.abs(nums[i]);
        }
    }
}