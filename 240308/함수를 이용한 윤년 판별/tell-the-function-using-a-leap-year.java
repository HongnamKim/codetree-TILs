import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();

        System.out.println(check(year));
    }

    public static boolean check(int year){
        if(year % 4 != 0){
            return false;
        } 
        if(year % 100 == 0 && year % 400 != 0){
            return false;
        }

        return true;
    }
}