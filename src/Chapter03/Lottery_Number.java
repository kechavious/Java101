package Chapter03;

import java.util.*;


//todo 彩票游戏
//      开发一个程序来玩彩票。程序随机生成一个三位数的彩票号码，然后提示用户输入一个三位数的数字，并根据以下规则确定用户是否中奖：
//      如果用户输入与彩票号码完全一致（顺序也一致），奖金为 $10,000。
//      如果用户输入的所有数字与彩票号码的所有数字匹配，奖金为 $3,000。
//      如果用户输入的一个数字与彩票号码的一个数字匹配，奖金为 $1,000。

public class Lottery_Number {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int number1= random.nextInt(10);
        int number2= random.nextInt(10);
        int number3= random.nextInt(10);



        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = sc.nextInt();

        int prize = 0;


        if (number1 == num1 && number2 == num2 && number3 == num3){
            System.out.println("You earn 10000$");
            prize += 10000;
        }else if (number1 == num1 || number2 == num2 || number3== num3) {
            System.out.println("You earn 3000$");
            prize += 3000;
        }
        else{
            if (number1 == num1){
                prize += 1000;
            }if (number2 == num2){
                prize += 1000;
            }if (number3 == num3){
                prize += 1000;
            }
        }

        System.out.println("You earn " + prize);

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);

    }
}
