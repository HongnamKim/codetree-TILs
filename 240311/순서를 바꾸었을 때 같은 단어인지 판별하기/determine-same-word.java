import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        char[] a = sc.nextLine().toCharArray();
        char[] b = sc.nextLine().toCharArray();

        Arrays.sort(a);
        String sortedA = new String(a);
        Arrays.sort(b);
        String sortedB = String.valueOf(b);

        if(sortedA.equals(sortedB)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        /*
        if(a.length != b.length){
            System.out.println("No");
            return;
        }

        for(int i = 0; i < a.length; i++){
            if(a[i] != b[i]) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
        */
    }
}