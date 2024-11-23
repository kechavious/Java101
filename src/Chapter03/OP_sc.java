package Chapter03;

import java.util.Random;
import java.util.Scanner;

public class OP_sc {
    public static void main(String[] args) {
        Random ran = new Random();
        Scanner sc = new Scanner(System.in);

        int random1 = ran.nextInt(10);
        int random2 = ran.nextInt(1,10);

        int result = 0;

        System.out.println("Enter the operator (+ - * /): ");
        String operator = sc.nextLine();

        switch (operator) {
            case "+":
                result = random1 + random2;
                break;
            case "-":
                result = random1 - random2;
                break;
            case "*":
                result = random1 * random2;
                break;
            case "/":
                result = random1 / random2;
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }

        System.out.println("What is " + random1 + " " + operator + " " + random2 + "?");
        int answer = sc.nextInt();

        if (answer == result) {
            System.out.println("Correct");
        } else {
            System.out.println("Wrong");
        }
    }
}
