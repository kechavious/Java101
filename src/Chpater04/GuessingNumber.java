package Chpater04;

import java.util.Scanner;
import java.util.Random;

public class GuessingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int rannum = rand.nextInt(100) + 1; // Generate a random number between 1 and 100 inclusive

        int guess;

        while (true) {
            System.out.print("Enter a number between 1 and 100: ");
            guess = sc.nextInt();

            if (guess == rannum) {
                System.out.println("Correct!");
                break;
            } else {
                if (guess > rannum) {
                    System.out.println("Not correct. Guessing number is bigger than the actual number. Try again.");
                } else {
                    System.out.println("Not correct. Guessing number is smaller than the actual number. Try again.");
                }
            }
        }
        sc.close(); // Close the scanner to prevent resource leak
    }
}

