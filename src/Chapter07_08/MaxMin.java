package Chapter07_08;

public class MaxMin {
    public static void main(String[] args) {
        double[] myList = {1.9, 3.4, 3.5, 2.9,1.1};

        for (int i =0 ; i < myList.length; i ++){
            System.out.println(myList[i]);
        }

        double total = 0;
        for (int i = 0; i < myList.length; i++) {
            total += myList[i];

        }
        System.out.println(total);

        double max = myList[0];
        for (int i = 1; i < myList.length; i++) {
            if (myList[i] > max) max = myList[i];
        }
        System.out.println("Max is " + max);


        double min = myList[0];
        for (int i = 1; i < myList.length; i++){
            if (myList[i] < min) min = myList[i];
        }
        System.out.println(min);

        /* todo



         */


    }
}
