package Chapter05;

import java.util.Scanner;

public class GradeBook_in_Method {
    public static void main(String[] args) {
        grade();
    }
    public static String grade() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the grade: ");
        int number = sc.nextInt();

        if (number >= 90) {
            System.out.println("A");
        } else if (number >= 80) {
            System.out.println("B");
        } else if (number >= 70) {
            System.out.println("C");
        } else if (number >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        return null;
    }
}
