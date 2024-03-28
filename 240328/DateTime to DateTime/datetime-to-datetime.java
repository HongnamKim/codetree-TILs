import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        LocalDateTime pivotDate = LocalDateTime.of(2011, 11, 11, 11, 11);
        LocalDateTime inputDate = LocalDateTime.of(2011, 11, a, b, c);

        Duration duration = Duration.between(pivotDate, inputDate);
        long l = duration.getSeconds() / 60;
        System.out.println(l);
    }
}