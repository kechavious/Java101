package Chapter05;

import java.util.Scanner;

public class SumOfExpressions_Notusemethod {
    public static void main(String[] args) {
        int x = 5;
        int n = 4;

        int total = 0;

        for (int i = x; i >0; i--){
            int term = 0;
            term += Math.pow(i,n);

            total += term;
        }

        System.out.println(total);
    }
}



// c = (2^0+0)+(2^1+1)+(2^2+2)+(2^3+3) = 0+3+6+11 = 18
