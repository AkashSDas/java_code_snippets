import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // If-else-if

        // Taking user input
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        if (input.equals("James")) {
            System.out.print("Welcome back Agent 007 \n");
        } else if (input.equals("Ethan")) {
            System.out.print("Your next mission should you choose to accept? \n");
        } else {
            System.out.print("You are not authorized \n");
        }

        // Closing the scanner
        sc.close();
    }
}
