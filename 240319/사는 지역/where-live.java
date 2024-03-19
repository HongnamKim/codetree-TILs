import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Address[] addresses = new Address[n];

        for(int i = 0; i < n; i++){
            addresses[i] = new Address(sc.next(), sc.next(), sc.next());
        }
        String a = "lee";
        String b = "park";

        //System.out.println(b.compareTo(a));

        int latestIndex = 0;
        for(int i = 0; i < n; i++){
            if(addresses[latestIndex].name.compareTo(addresses[i].name) < 0) {
                latestIndex = i;
            }
        }

        System.out.println(addresses[latestIndex].toString());
    }

    public static class Address {
        public String name;
        public String code;
        public String city;

        public Address(String name, String code, String city) {
            this.name = name;
            this.code = code;
            this.city = city;
        }

        @Override
        public String toString() {
            return "name " + this.name + "\n" +
                    "addr " + this.code + "\n" +
                    "city " + this.city + "\n";
        }
    }
}