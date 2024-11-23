package Quiz1;

import java.util.Scanner;

public class GuessingCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int card = 7;
        String cname = "suit";

        while (true) {
            System.out.print("Enter the number: ");
            int num = sc.nextInt();
            sc.nextLine();  // Consume the leftover newline

            System.out.print("Enter the name: ");
            String name = sc.nextLine();

            if (num == card && name.equals(cname)) { // Use .equals() for string comparison
                System.out.println("You are correct!");
                break; // Exit the loop after finding the correct answer
            } else {
                System.out.println("Try again!");
            }
        }

        sc.close(); // Close the Scanner object
    }
}

