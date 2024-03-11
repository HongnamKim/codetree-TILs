import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums1 = new int[n];
        int[] nums2 = new int[n];

        for(int i = 0; i < n; i++){
            nums1[i] = sc.nextInt();
        }

        Arrays.sort(nums1);

        for(int i = 0; i < n; i++){
            nums2[i] = sc.nextInt();
        }

        Arrays.sort(nums2);

        for(int i = 0; i < n; i++){
            if(nums1[i] != nums2[i]){
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }
}