import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> nums = new ArrayList<>();
        for(int i = 0; i < n; i++){
            nums.add(sc.nextInt());
        }

        List<Integer> sorted = nums.stream().sorted().collect(Collectors.toList());

        int maximum1 = sorted.get(0) * sorted.get(1) * sorted.get(sorted.size() - 1);
        int maximum2 = sorted.get(sorted.size() - 1) * sorted.get(sorted.size() - 2) * sorted.get(sorted.size() - 3);

        if(maximum1 > maximum2){
            System.out.println(maximum1);
        }else {
            System.out.println(maximum2);
        }
    }
}