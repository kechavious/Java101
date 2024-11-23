package Chapter05;

import java.util.Scanner;

public class SentinelValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        while (true) {
            System.out.print("Enter a number (enter 0 to end): ");
            int number = sc.nextInt();

            if (number == 0) {
                break; // Exit the loop if the user enters 0
            }

            sum += number;
        }

        System.out.println("The sum of the numbers entered is: " + sum);
    }
}

