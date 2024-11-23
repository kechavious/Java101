package Chapter07_08;

import java.util.Scanner;

public class number_adding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the game!");
        System.out.println("Please enter a number between 1 and 1000: ");

        int number = scanner.nextInt();

        // Validate if the number is within the specified range
        if (number < 1 || number > 1000) {
            System.out.println("Invalid input! Please enter a number between 1 and 1000.");
            return; // Exit the program
        }

        int sum = 0;
        int tempNumber = number;

        // Calculate the sum of digits
        while (tempNumber > 0) {
            sum += tempNumber % 10; // Add the last digit to the sum
            tempNumber /= 10; // Remove the last digit
        }

        System.out.println("The sum of the digits of " + number + " is: " + sum);
    }
}
