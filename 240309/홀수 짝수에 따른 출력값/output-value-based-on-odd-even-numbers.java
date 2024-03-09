import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(f(n));
    }

    public static int f(int n){
        if(n == 1 || n == 2){
            return n;
        }

        return f(n-2) + n;
    }
}