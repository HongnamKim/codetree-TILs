import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int min = minimum(a, b, c);

        System.out.println(min);
    }

    public static int minimum(int a, int b, int c){
        return Math.min(Math.min(a, b), c);
    }
}