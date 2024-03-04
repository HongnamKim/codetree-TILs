import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] house = new int[n];

        for(int i = 0; i < n; i++){
            house[i] = sc.nextInt();
        }

        int minDistance = Integer.MAX_VALUE;


        for(int i = 0; i < n; i++){
            int currentDistance = 0;
            for(int j = 0; j < n; j++){
                currentDistance = currentDistance + Math.abs(j - i) * house[j];
            }

            if(currentDistance < minDistance){
                minDistance = currentDistance;
            }
        }

        System.out.println(minDistance);
    }
}