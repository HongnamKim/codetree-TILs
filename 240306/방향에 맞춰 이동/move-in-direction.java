import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int x = 0;
        int y = 0;

        int[] dx = new int[]{0, 0, 1, -1}; // N S E W
        int[] dy = new int[]{1, -1, 0, 0}; // N S E W

        for(int i = 0; i < n; i++){
            char dir = sc.next().charAt(0);
            int distance = sc.nextInt();

            if(dir == 'N'){
                x = x + dx[0] * distance;
                y = y + dy[0] * distance;
            } else if(dir == 'S') {
                x = x + dx[1] * distance;
                y = y + dy[1] * distance;
            } else if(dir == 'E') {
                x = x + dx[2] * distance;
                y = y + dy[2] * distance;
            } else { // dir == 'W'
                x = x + dx[3] * distance;
                y = y + dy[3] * distance;
            }
            //System.out.println(x + " " + y);
        }

        System.out.println(x + " " + y);
    }
}