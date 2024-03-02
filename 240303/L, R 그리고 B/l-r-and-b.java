import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int boardSize = 10;
        char[][] board = new char[boardSize][boardSize];

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < boardSize; i++){
            String row = sc.nextLine();
            for(int j = 0; j < boardSize; j++){
                board[i][j] = row.charAt(j);
            }
        }
        
        int[] bPosition = find(board, 'B', boardSize);
        int[] lPosition = find(board, 'L', boardSize);

        int rowDistance = Math.abs(bPosition[1] - lPosition[1]);
        int colDistance = Math.abs(bPosition[0] - lPosition[0]);

        int totalDistance = rowDistance + colDistance - 1;

        System.out.println(totalDistance);
        
    }

    public static int[] find(char[][] board, char target, int boardSize){
        for(int i = 0; i < boardSize; i++){
            for(int j = 0; j < boardSize; j++){
                if(board[i][j] == target){
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{-1, -1};
    }
}