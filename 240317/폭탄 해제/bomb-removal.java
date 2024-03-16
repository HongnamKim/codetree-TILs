import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        Bomb bomb = new Bomb(sc.next(), sc.next(), sc.nextInt());

        System.out.println("code : " + bomb.getCode());
        System.out.println("color : " + bomb.getColor());
        System.out.println("second : " + bomb.getSec());
    }

    public static class Bomb {
        private String code;
        private String color;
        private int sec;

        public Bomb(String code, String color, int sec){
            this.code = code;
            this.color = color;
            this.sec = sec;
        }

        public String getCode(){
            return this.code;
        }

        public String getColor(){
            return this.color;
        }
        
        public int getSec() {
            return this.sec;
        }
    }
}