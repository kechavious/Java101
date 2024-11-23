package Chapter05;
import java.util.*;

public class SubtractionQuizLoop {
    public static void main(String[] args) {
        final int NUMBER_OF_QUESTIONS = 5; // Number of questions
        int correctCount = 0; // Count the number of correct answers
        int count = 0; // Count the number of questions

        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        while(count < NUMBER_OF_QUESTIONS){
            int randomnumber1 = random.nextInt(0,11);
            int randomnumber2 = random.nextInt(0,11);

            if (randomnumber1 < randomnumber2){
                int temp = randomnumber1;
                randomnumber1 = randomnumber2;
                randomnumber2 = temp;
            }

            System.out.println("What is " + randomnumber1 +"-" + randomnumber2 + "?");
            int answer = sc.nextInt();


            if (answer == randomnumber1 - randomnumber2){
                System.out.println("You are correct!");
                correctCount++;
            }else{
                System.out.println("Your answer is wrong");
            }
            count++;
        }


        System.out.println("You are in " + correctCount);
    }
}
