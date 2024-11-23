package Chpater04;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入一个整数: ");
        int intValue = scanner.nextInt();
        System.out.println("你输入的整数是: " + intValue);

        System.out.print("请输入一个长整数: ");
        long longValue = scanner.nextLong();
        System.out.println("你输入的长整数是: " + longValue);

        System.out.print("请输入一个双精度浮点数: ");
        double doubleValue = scanner.nextDouble();
        System.out.println("你输入的双精度浮点数是: " + doubleValue);


        scanner.close();
    }
}
