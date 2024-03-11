import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n * 2];
        int[] results = new int[n];

        for(int i = 0; i < n * 2; i++){
            nums[i] = sc.nextInt();
        }

        Arrays.sort(nums);

        for(int i = 0; i < n; i++){
            results[i] = nums[i] + nums[2 * n - 1 - i];
        }

        Arrays.sort(results);
        System.out.println(results[n-1]);
    }
}