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

        List<Integer> list = nums.stream().sorted().collect(Collectors.toList());

        int min = list.get(0);
        int secondMin;
        int location;
        for(int i = 0; i < list.size(); i++){
            if(min < list.get(i)){
                secondMin = list.get(i); // 두번재로 작은 수
                
                if(i != list.size()-1 && list.get(i+1) == secondMin){ // 더 있는지 확인
                    System.out.println(-1);
                    return;
                }
                
                System.out.println(nums.indexOf(secondMin) + 1);
                return;
            }
        }
        System.out.println(-1);
    }
}