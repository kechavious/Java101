package Chapter03;

import java.util.Random;
import java.util.Scanner;

public class OP {
    public static void main(String[] args) {
            Random ran = new Random();
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the operation you want (+ - * /): ");
            String input = sc.nextLine();

            int random1 = ran.nextInt(10);
            int random2 = ran.nextInt(10);
            int result = 0;

            System.out.print("What is " + random1 + " " + input + " " + random2 + ": ");
            int input1 = sc.nextInt();

            if (input.equals("+")) {
                result = random1 + random2;
            } else if (input.equals("-")) {
                result = random1 - random2;
            } else if (input.equals("/")) {
                if (random2 == 0) {
                    System.out.println("Division by zero is not allowed.");
                    System.exit(1); // Exit the program
                }
                result = random1 / random2;
            } else if (input.equals("*")) {
                result = random1 * random2;
            }

            if (input1 == result) {
                System.out.println("Correct");
            } else {
                System.out.println("Wrong");
            }
        }
    }


