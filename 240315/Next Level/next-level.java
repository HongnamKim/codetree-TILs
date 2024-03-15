import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        User user1 = new User();
        User user2 = new User(sc.next(), sc.nextInt());

        System.out.println("user " + user1.getName() + " lv " + user1.getLevel());
        System.out.println("user " + user2.getName() + " lv " + user2.getLevel());
    }
    static class User{
        private String name;
        private int level;

        public User(){
            this.name = "codetree";
            this.level = 10;
        }

        public User(String name, int level){
            this.name = name;
            this.level = level;
        }

        public String getName() {
            return name;
        }

        public int getLevel() {
            return level;
        }
    }
}