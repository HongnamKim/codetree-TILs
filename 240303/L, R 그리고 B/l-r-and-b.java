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
        int[] rPosition = find(board, 'R', boardSize);

        int rowDistance = Math.abs(bPosition[1] - lPosition[1]);
        int colDistance = Math.abs(bPosition[0] - lPosition[0]);

        boolean isSameLine = checkSameLine(bPosition, lPosition, rPosition);

        int totalDistance = isSameLine ? rowDistance + colDistance + 1 : rowDistance + colDistance - 1;

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

    public static boolean checkSameLine(int[] bPosition, int[] lPosition, int[] rPosition){
        if(bPosition[0] == lPosition[0] && lPosition[0] == rPosition[0]){
            if(bPosition[1] > lPosition[1] && rPosition[1] > bPosition[1]){
                // l b r
                return false;
            } else if (bPosition[1] < lPosition[1] && rPosition[1] > lPosition[1]) {
                // b l r
                return false;
            } else if (rPosition[1] < bPosition[1] && rPosition[1] < lPosition[1]) {
                // r l b
                // r b l
                return false;
            }
            return true;
        } else if (bPosition[1] == lPosition[1] && lPosition[1] == rPosition[1]) {
            if(bPosition[0] > lPosition[0] && rPosition[0] > bPosition[0]){
                // l b r
                return false;
            } else if (bPosition[0] < lPosition[0] && rPosition[0] > lPosition[0]) {
                // b l r
                return false;
            } else if (rPosition[0] < bPosition[0] && rPosition[0] < lPosition[0]) {
                // r l b
                // r b l
                return false;
            }
            return true;
        }

        return false;
    }
}