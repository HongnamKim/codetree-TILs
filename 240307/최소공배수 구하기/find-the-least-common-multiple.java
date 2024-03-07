import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        LCM(n, m);
    }

    public static void LCM(int n, int m){
        int smallNum = Math.min(n, m);

        for(int i = smallNum; i >= 1; i--){
            if(n % i == 0 && m % i == 0){
                int lcm = i * n / i * m / i;
                System.out.println(lcm);
                break;
            }
        }
    }
}