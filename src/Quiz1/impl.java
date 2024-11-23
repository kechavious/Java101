package Quiz1;

import java.util.Scanner;

public class impl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the x: ");
        int x = sc.nextInt();
        int n = 4; 

        int result = 0;

        for (int i = n; i >= 0; i--) {
            result += (x + i);
        }
        System.out.println(result);
    }
}

