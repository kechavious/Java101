package Assignment2;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the phrase: ");
        String phrase = sc.nextLine();
        int length = phrase.length();

        boolean isP = true;

        for (int i = 0; i < length / 2; i ++){
            if (phrase.charAt(i) != phrase.charAt(length - 1 -i)){
                isP = false;
            }
        }

        if (isP){
            System.out.println("This is palidrome. ");
        }else {
            System.out.println("This is not the palidrome");
        }




    }
}
