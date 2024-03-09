import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int result = divide(n);

        System.out.println(result);
    }

    public static int divide(int n){
        if(n == 1){
            return 0;
        }

        int nextN;
        if(n % 2 == 0){
            nextN = n / 2;
        } else {
            nextN = n / 3;
        }

        
        return divide(nextN) + 1;
    }
}