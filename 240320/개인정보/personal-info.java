import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Info[] infos = new Info[5];

        for(int i = 0; i < 5; i++){
            infos[i] = new Info(sc.next(), sc.nextInt(), sc.nextFloat());
        }

        Arrays.sort(infos, Comparator.comparing(a -> a.name));
        System.out.println("name");
        for(int i = 0; i < 5; i++){
            System.out.println(infos[i].toString());
        }
        System.out.println();

        Arrays.sort(infos);
        System.out.println("height");
        for(int i = 0; i < 5; i++){
            System.out.println(infos[i].toString());
        }
    }

    static class Info implements Comparable<Info>{
        public String name;
        public int height;
        public float weight;

        public Info(String name, int height, float weight) {
            this.name = name;
            this.height = height;
            this.weight = weight;
        }

        @Override
        public int compareTo(Info info) {
            return info.height - this.height;
        }

        @Override
        public String toString() {
            return name + " " + height + " " + weight;
        }
    }
}