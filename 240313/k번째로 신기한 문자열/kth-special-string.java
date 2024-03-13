import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        String T = sc.next();

        List<String> arr = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String temp = sc.next();
            if(temp.startsWith(T)) {
                arr.add(temp);
            }
        }

        List<String> collect = arr.stream().sorted().collect(Collectors.toList());
        System.out.println(collect.get(k-1));
    }
}