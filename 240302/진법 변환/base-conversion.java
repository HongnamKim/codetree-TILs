import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int order = sc.nextInt();

        int result = 0;
        
        for(int i = 0; i < input.length(); i++){
            int convert = Character.getNumericValue(input.charAt(i)) * (int) Math.pow(order, i);
            result += convert;
        }

        System.out.println(result);
    }
}