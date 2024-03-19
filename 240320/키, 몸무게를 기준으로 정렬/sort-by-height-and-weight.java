import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Info[] infos = new Info[n];

        for(int i = 0; i < n; i++){
            infos[i] = new Info(sc.next(), sc.nextInt(), sc.nextInt());
        }

        Arrays.sort(infos);

        for(int i = 0; i < n; i++){
            System.out.println(infos[i].toString());
        }
    }

    public static class Info implements Comparable<Info> {
        public String name;
        public int height;
        public int weight;

        public Info(String name, int height, int weight) {
            this.name = name;
            this.height = height;
            this.weight = weight;
        }

        @Override
        public int compareTo(Info info) {
            if(this.height == info.height){
                return info.weight - this.weight;
            }
            return this.height - info.height;
        }

        @Override
        public String toString() {
            return name + " " + height + " " + weight;
        }
    }
}