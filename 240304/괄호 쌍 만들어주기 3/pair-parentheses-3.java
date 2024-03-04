import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        int count = 0;
        for(int i = 0; i < input.length() - 1; i ++){
            if('(' != input.charAt(i)){
                continue;
            }
            for (int j = i + 1; j < input.length(); j++){
                if(')' == input.charAt(j)){
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}