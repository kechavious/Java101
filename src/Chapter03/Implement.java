package Chapter03;

import java.util.Scanner;

public class Implement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        long result = 1;

        for (int i = number; i > 0; i--){
            result*=i;
        }
        System.out.println(result);
    }
}
