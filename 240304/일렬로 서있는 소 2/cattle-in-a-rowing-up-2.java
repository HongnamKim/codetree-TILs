import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] cows = new int[5];

        for(int i = 0; i < n; i++){
            cows[i] = sc.nextInt();
        }

        int count = 0;
        for(int i = 0; i < n-2; i++){
            for(int j = 1; j < n - 1; j++){
                if(cows[i] < cows[j]){
                    continue;
                }
                for(int k = 2; k < n; k++){
                    if(cows[j] < cows[k]) {
                        continue;
                    }
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}