package Chapter05.Exercise_in_Class;

import java.util.*;

public class EvenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting number: ");
        int start = sc.nextInt();
        System.out.print("Enter the ending number: ");
        int end = sc.nextInt();


        int result = Evensum(start, end);

        System.out.print("The result is: " + result);
    }
    public static int Evensum(int start, int end){
        int sum = 0;

        for (int i = start; i <= end; i ++){
            if (i % 2 == 0){
                sum += i;
                System.out.println(sum);
            }
        }
        return sum;
    }
}
