import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        int order = sc.nextInt();

        System.out.println(Integer.parseInt(input, order));
    }
}