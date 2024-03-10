import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        char[] chars = str.toCharArray();

        Arrays.sort(chars);

        String sortedStr = String.valueOf(chars);

        System.out.println(sortedStr);
    }
}