import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int resultA = calc(a, b);
        int resultB = calc(b, a);

        System.out.println(resultA + " " + resultB);
    }

    public static int calc(int a, int b) {
        if(a > b) {
            return a *= 2;
        } else {
            return a += 10;
        }
    }
}