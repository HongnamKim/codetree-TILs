import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(check(n)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean check(int n){
        int ten = n / 10;
        int one = n % 10;

        if((ten + one) % 5 == 0 && n % 2 == 0){
            return true;
        } else{
            return false;
        }
    }

    
}