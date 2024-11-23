package Chapter01;

import java.util.Random;
import java.util.Scanner;

public class nn {

    public static void main(String[] args) {
        Random rado = new Random();
        Scanner sc = new Scanner(System.in);

        int random = rado.nextInt(100);

        boolean flag = false;


        System.out.print("Enter the number you want: ");

        while (!flag) {
            System.out.print("Enter the number you want: ");
            int num = sc.nextInt();

            if (num > random) {
                System.out.println("Big, try again");
            } else if (num < random) {
                System.out.println("Small, try again");
            } else {
                System.out.println("You win");
                flag = true; // Corrected to modify the existing 'flag' variable
            }
        }

        sc.close();
    }
}

