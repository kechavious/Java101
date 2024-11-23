package Assignment2;

import java.util.*;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double initialize = 1000; // Corrected variable name

        System.out.println("Welcome to the bankTeller");

        while (true) {
            System.out.print("Enter the operation (i, ii, iii, iv): ");
            String op = sc.nextLine();

            switch (op) {
                case "i":
                    System.out.print("Enter the money you want to withdraw: ");
                    double withdraw = sc.nextDouble();
                    if (withdraw > initialize) {
                        System.out.println("Sorry, insufficient funds");
                    } else {
                        initialize -= withdraw;
                        System.out.println("Withdrawal successful");
                    }
                    break;

                case "ii":
                    System.out.print("Enter the money you want to deposit: ");
                    double deposit = sc.nextDouble();
                    if (deposit < 0) {
                        System.out.println("Invalid amount");
                    } else {
                        initialize += deposit;
                        System.out.println("Deposit successful");
                    }
                    break;

                case "iii":
                    System.out.println("Current balance: " + initialize);
                    break;

                case "iv":
                    System.out.println("Thank you!");
                    sc.close();
                    return; // Exit the program

                default:
                    System.out.println("Invalid operation choice");
            }
            // Consume the newline character left by nextDouble
            sc.nextLine();
        }
    }
}

