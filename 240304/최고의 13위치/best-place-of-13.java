import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] board = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                board[i][j] = sc.nextInt();
            }
        }

        int max = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - 2; j++){
                max = Math.max(max, board[i][j] + board[i][j+1] + board[i][j+2]);
            }
        }

        System.out.println(max);
    }
}