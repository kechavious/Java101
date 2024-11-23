package Chapter05;

import java.util.Scanner;

public class SumOfExpressions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the x: ");
        int x = sc.nextInt();

        System.out.print("Enter the n: ");
        int n = sc.nextInt();

        double result = power(x, n);

        System.out.println("Result: " + result);
    }

    public static double power(int x, int n) {
        double sum = 0;

        for (int i = n; i>=0; i--) {
            double term = Math.pow(x, i) + i;

            sum += term;

            System.out.println(sum);
        }

        return sum;
    }
}


// c = (2^0+0)+(2^1+1)+(2^2+2)+(2^3+3) = 0+3+6+11 = 18
