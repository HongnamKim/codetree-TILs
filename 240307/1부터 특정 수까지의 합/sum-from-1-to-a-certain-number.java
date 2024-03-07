import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = solution(n);

        System.out.println(result);
    }

    public static int solution(int n){
        int sum = (n + 1)*n/2;
        return sum / 10;
        
    }
}