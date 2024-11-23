package Assignment2;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number you want: ");
        double number = sc.nextDouble();

        System.out.print("Enter an exponent you want: ");
        int exp = sc.nextInt();

        double result = 1.0;

        if (exp < 0) {
            for (int i = 0; i < -exp; i++) {
                result *= number;
                System.out.println(result);
            }
            result = 1.0 / result;
            System.out.println(result);
        } else {
            for (int i = 0; i < exp; i++) {
                result *= number;
            }
        }

        System.out.println("The exponential result of the number is: " + result);
    }
}
