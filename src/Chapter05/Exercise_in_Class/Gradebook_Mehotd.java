package Chapter05.Exercise_in_Class;

import java.util.*;

public class Gradebook_Mehotd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the grade: ");
        int grade = sc.nextInt();

        grade(grade);
    }
    public static void grade(int grade){
        if (grade >= 90){
            System.out.print("A");
        } else if (grade >= 80) {
            System.out.print("B");
        } else if (grade >= 70){
            System.out.print("C");
        } else if (grade >= 60){
            System.out.println("F");
        }
    }
}
