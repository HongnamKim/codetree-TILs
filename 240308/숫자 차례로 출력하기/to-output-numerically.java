import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ascend(n);
        System.out.println();
        descend(n);
    }

    public static void ascend(int n){
        if(n == 0){
            return;
        }
        ascend(n - 1);
        System.out.print(n + " ");
    }

    public static void descend(int n){
        System.out.print(n + " ");
        if(n == 1){
            return;
        }
        descend(n - 1);
    }
}