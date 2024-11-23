package Chapter03;

import java.util.Random;
import java.util.Scanner;

public class Random_part {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        boolean correct = false; // 用于跟踪是否猜对

        int random = r.nextInt(100); // 生成一个0到99的随机整数

        while (!correct) {
            System.out.println("Please enter a number between 0 and 99: ");
            int userInput = sc.nextInt();

            if (userInput < random) {
                System.out.println("Too small, try again");
            } else if (userInput > random) {
                System.out.println("Too big, try again");
            } else {
                System.out.println("Correct!");
                correct = true; // 设置correct为true以结束循环
            }
        }

        sc.close();
    }

    public static class Lottery_number {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Random rn = new Random();

            int random1 = rn.nextInt(0,10);
            int random2 = rn.nextInt(0,10);
            int random3 = rn.nextInt(0,10);

            System.out.print("Enter the first number: ");
            int input1 = sc.nextInt();

            System.out.println("Enter the second number: ");
            int input2 = sc.nextInt();

            System.out.println("Enter the thrid number: ");
            int input3 = sc.nextInt();

            int money = 0;

            if (input1 == random1 && input2 == random2 && input3 == random3){
                System.out.println("You earn 10000$");
                money += 10000;
            } else if (input1 == random1 || input2 == random2 || input3 == random3){
                System.out.println("You earn 7500$");
                money += 7500;
            }else{
                if (input1 == random1){
                    System.out.println("You earn 1000$");
                    money += 1000;
                }if (input2 == random2){
                    System.out.println("You earn 1000$");
                    money += 1000;
                }if (input3 == random3){
                    System.out.println("You earn 1000$");
                    money += 1000;
                }
            }

            System.out.println("You earn " + money);

        }

    }
}

