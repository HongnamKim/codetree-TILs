import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];
    
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        System.out.println(findMax(nums, 0));
    }

    public static int findMax(int[] nums, int n){
        if(n == nums.length-1){
            return nums[n];
        }
        if(nums[n] > nums[n+1]){
            int temp = nums[n];
            nums[n] = nums[n+1];
            nums[n + 1] = temp;

            return findMax(nums, n+1);
        } else {
            return findMax(nums, n+1);
        }
    }
}