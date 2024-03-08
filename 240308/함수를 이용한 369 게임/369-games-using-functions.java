import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int cnt = 0;
        for(int i = a; i <= b; i++){
            if(i % 3 == 0 || containThree(i)){
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    public static boolean containThree(int n){
        String stringN = Integer.toString(n);

        for(int i = 0; i < stringN.length(); i++){
            if(stringN.charAt(i) == '3' || stringN.charAt(i) == '6' || stringN.charAt(i) == '9'){
                return true;
            }
        }

        return false;
    }
}