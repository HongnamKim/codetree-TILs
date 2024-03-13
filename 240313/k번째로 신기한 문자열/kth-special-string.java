import java.util.Arrays;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        String T = sc.next();

        String[] arr = new String[n];
        int index = 0;
        for(int i = 0; i < n; i++){
            String temp = sc.next();
            if(temp.startsWith(T)) {
                arr[index++] = temp;
            }
        }

        String[] arr2 = new String[index];
        for(int i = 0; i < index; i++){
            arr2[i] = arr[i];
        }

        Arrays.sort(arr2);
        System.out.println(arr2[k-1]);
    }
}