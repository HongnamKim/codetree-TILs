import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Point[] points = new Point[n];

        for(int i = 0; i < n; i++){
            points[i] = new Point(i+1, sc.nextInt(), sc.nextInt());
        }

        Arrays.sort(points);

        for(int i = 0; i < n; i++){
            System.out.println(points[i].index);
        }
    }

    static class Point implements Comparable<Point> {
        public int index;
        public int x, y, distance;

        public Point(int index, int x, int y) {
            this.index = index;
            this.x = x;
            this.y = y;
            this.distance = Math.abs(x) + Math.abs(y);
        }

        @Override
        public int compareTo(Point point) {
            if(this.distance == point.distance){
                return this.index - point.index;
            }
            return this.distance - point.distance;
        }
    }
}