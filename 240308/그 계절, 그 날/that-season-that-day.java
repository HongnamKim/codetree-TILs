import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();


        if(monthLastDay(y, m) < d){
            System.out.println(-1);
            return;
        }
        System.out.println(checkSeason(m));
    }

    public static String checkSeason(int m){
        if(3 <= m && m <= 5){
            return "Spring";
        } else if (6 <= m && m <= 8) {
            return "Summer";
        } else if (9 <= m && m <= 11){
            return "Fall";
        } else {
            return "Winter";
        }
    }

    public static int monthLastDay(int y, int m){
        if(m == 2){
            return checkYear(y);
        }
        int[] longMonth = {1, 3, 5, 7, 8, 10, 12};
        for(int i = 0; i < longMonth.length; i++){
            if(longMonth[i] == m){
                return 31;
            }
        }

        return 30;
    }

    public static int checkYear(int y){
        if(y % 4 != 0){
            return 28;
        }
        if(y % 100 == 0 && y % 400 != 0){
            return 28;
        }
        return 29;
    }
}