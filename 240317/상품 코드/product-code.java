import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        Item item1 = new Item();
        Item item2 = new Item(sc.next(), sc.nextInt());

        System.out.printf("product %d is %s\n", item1.itemCode, item1.itemName);
        System.out.printf("product %d is %s\n", item2.itemCode, item2.itemName);
    }

    public static class Item{
        public String itemName = "codetree";
        public int itemCode = 50;

        public Item() {
        }

        public Item(String itemName, int itemCode){
            this.itemName = itemName;
            this.itemCode = itemCode;
        }
    }
}