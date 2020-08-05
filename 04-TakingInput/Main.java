import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Input & Scanner

        Scanner sc = new Scanner(System.in);
        // There are different types of scanner, here we have used System.in

        String str_scanned = sc.next();

        // Printing what is scanned, taking the first letter
        System.out.println(str_scanned);

        // Taking integer input
        int int_scanned = sc.nextInt();
        System.out.println(int_scanned);

        // Taking double input
        double double_scanned = sc.nextDouble();
        System.out.println(double_scanned);

        // Taking boolean input
        boolean boolean_scanned = sc.nextBoolean();
        System.out.println(boolean_scanned);

        // Good Way
        String input = sc.next();
        int num = Integer.parseInt(input);
        System.out.println(num);

        // Closing the scanner
        sc.close();
    }
}
