import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // *** Content ***
        // - for loop
        // - for each type loop
        // - while loop
        // - do while loop

        // For-Loop
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        int[] nums = new int[10];
        for (int i = 1; i <= nums.length; i += 3) {
            nums[i - 1] = i;
        }

        // For-Each loop
        int[] arr = { 1, 3, 52, 1, 4934, 221 };
        String[] names = new String[5];
        for (int element : arr) {
            System.out.println(element);
        }

        int index = 0;
        for (int num : arr) {
            System.out.println(index + " " + num);
            index++;
        }

        // Taking user input as there name and stroing it in the array
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < names.length; i++) {
            System.out.println("Input: ");
            String input = sc.nextLine();
            names[i] = input;
        }

        // Printing the user input names
        int count = 0;
        for (String name : names) {
            System.out.println(count + " " + name);
            count++;
        }

        // break, breaking out of the loop
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println("This is the end of the journey");
                break;
            }
            System.out.println(i);
        }

        // continue, breaking out of the loop
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println("This is where we encountered 5");
                continue;
            }
            System.out.println(i);
        }

        // While loop
        boolean is_right = false;
        int secret_num = 7;

        System.out.println("This loop goes to infinity");
        System.out.println("Choose number between 1 to 10");

        String winner_statment = "Bravo, you wasted your time, Now just disappear";
        String high_guess_statment = "Your hitting the sky, come close to the ground";
        String low_guess_statment = "Your going to the hell, that's where you belong, anyhow...come close to the ground";
        String final_statment = "Something terrible is going on!!!";

        int num = sc.nextInt();
        while (!(is_right)) {
            if (num == secret_num) {
                System.out.println(winner_statment);
                is_right = true;
                break;
            } else if (num > secret_num) {
                System.out.println(high_guess_statment);
            } else if (num < secret_num) {
                System.out.println(low_guess_statment);
            } else {
                System.out.println(final_statment);
            }
            num = sc.nextInt();
        }
        // Closing the scanner
        sc.close();

        // do while loop
        // This loop will be executed atleast once even if the condition is false
        int n = 10;
        do {
            System.out.println(n);
        } while (n == 1);
    }
}
