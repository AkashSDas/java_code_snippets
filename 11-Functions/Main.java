import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        hello_world();

        greeting("James", 4);

        int sum_result = add(19, 1);
        System.out.println(sum_result);

        sc.close();
    }

    public static void hello_world() {
        System.out.println("Hello World");
    }

    public static void greeting(String name, int times) {
        for (int i = 1; i <= times; i++) {
            System.out.println(i + " " + name);
        }
    }

    public static int add(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }
}
