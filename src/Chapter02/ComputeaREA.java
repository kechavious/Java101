package Chapter02;

import java.util.*;

public class ComputeaREA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter the radius: ");
        double radius = sc.nextDouble();

        double area = radius * radius * 3.14158265858979;

        System.out.println(area);
    }
}
