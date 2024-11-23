package Chpater04;
import java.util.Scanner;

public class Even_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting number: ");
        int startnum = sc.nextInt();

        System.out.print("Enter the ending number: ");
        int endnum = sc.nextInt();

        int total = 0;
        for (int num = startnum; num <= endnum; num++) {
            if (num % 2 == 0) {
                total += num;
            }
        }
        System.out.println("THE SUM OF THE EVEN NUMBERS IS: " + total);
    }
}

