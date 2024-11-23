package Chapter05;
import java.util.Scanner;

public class A_Quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Welcome to the number game");
        System.out.print("Please enter the op you want(+ - * /): ");
        String op = sc.nextLine();

        int random1 = (int)(Math.random() * 10);
        int random2 = (int)(Math.random() * 10);

        int result;

        switch(op){
            case "+":
                System.out.print("Enter the result of " + random1+ "+" +random2+": ");
                int yourresult = sc.nextInt();

                result = random1 + random2;

                if (result == yourresult){
                    System.out.println("You are correct!");
                } else{
                    System.out.println("You are wrong!");
                }
                break;

            case "-":
                System.out.print("Enter the result of " + random1+ "-" +random2+": ");
                int yourresult2 = sc.nextInt();
                result = random1 - random2;

                if (result == yourresult2){
                    System.out.println("You are correct!");
                } else{
                    System.out.println("You are wrong");
                }
                break;

            case "*":
                System.out.print("Enter the result of " + random1+ "*" +random2+": ");
                int yourresult3 = sc.nextInt();
                result = random1 * random2;

                if (result == yourresult3) {
                    System.out.println("You are correct!");
                } else{
                    System.out.println("You are wrong!");
                }

                break;

            case "/":
                System.out.print("Enter the result of " + random1+ "/" +random2+": ");
                int yourresult4 = sc.nextInt();
                result = random1 / random2;


                if (result == yourresult4){
                    System.out.println("You are correct!");
                } else{
                    System.out.println("You are wrong! ");
                }

                break;
        }


    }
}
