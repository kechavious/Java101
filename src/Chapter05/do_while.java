package Chapter05;

import java.util.Scanner;

public class do_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int number;

        do {
            System.out.print("Enter a number greater than 0 (enter 0 to exit): ");
            number = sc.nextInt();
            if (number > 0) {
                sum += number;
            }
        } while (number != 0);

        System.out.println("The sum is " + sum);
        sc.close(); // Close the scanner to prevent resource leak
    }
}

