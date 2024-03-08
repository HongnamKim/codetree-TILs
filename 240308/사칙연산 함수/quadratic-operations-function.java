import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        char b = sc.next().charAt(0);
        int c = sc.nextInt();

        String result = calculate(a, b, c);

        if("False".equals(result)){
            System.out.println(result);
        } else{
            System.out.println(a + " " + b + " " + c + " = " + result);
        }
    }

    public static String calculate(int a, char b, int c){
        switch (b){
            case '+': {return Integer.toString(a + c);}
            case '-': {return Integer.toString(a - c);}
            case '*': {return Integer.toString(a * c);}
            case '/': {return Integer.toString(a / c);}
            default: {return "False";}
        }
    }
}