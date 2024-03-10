import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        Integer[] arr2 = Arrays.stream(arr).boxed().toArray(Integer[]::new);

        Integer[] ascend = Arrays.stream(arr2).sorted().toArray(Integer[]::new);
        Integer[] descend = Arrays.stream(arr2).sorted(Collections.reverseOrder()).toArray(Integer[]::new);

        printArr(ascend);
        printArr(descend);
    }

    public static void printArr(Object[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}