package Chapter03;

import java.util.*;

public class random_number {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        double x = random.nextInt(11);
        double y = random.nextInt(11);

        System.out.println("Welcome to the game");
        System.out.println("Here you will choose an op: +, -, *, /");
        System.out.print("Enter an operator: ");

        String op = sc.nextLine();

        double result = cal(x, y, op);
        System.out.println("Result: " + result);
    }

    public static double cal(double x, double y, String op){
        switch (op){
            case "+":
                return x + y;
            case "-":
                return x - y;
            case "*":
                return x * y;
            case "/":
                if (y == 0) {
                    System.out.println("Cannot divide by zero!");
                    return Double.NaN; // return NaN (Not a Number) for division by zero
                }
                return x / y;
            default:
                System.out.println("Invalid operator!");
                return Double.NaN; // return NaN for invalid operator
        }
    }
}
