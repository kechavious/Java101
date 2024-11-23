package Chapter07_08;

public class ArrayListExercise4 {
    public static void main(String[] args) {
        double[] charArray = {1.4, 2.2, 1.3, 5.6, 3.5};

        // todo the elements in array
        //  便利里面的元素i，否则是memory addres

       for (int i = 0; i < charArray.length; i++){
           System.out.println(charArray[i]);
       }

        //todo the total of the elements in array

        double total = 0;
        for (int i = 0; i < charArray.length; i++){
            total += charArray[i];
        }
        System.out.println(total);



        //todo find the max
        double max = charArray[0];
        for (int i = 1; i < charArray.length; i ++){
            if (charArray[i] > max){
                max = charArray[i];
            }
        }
        System.out.println(max);


        //todo find the min
        double min = charArray[0];
        for (int i = 1; i < charArray.length; i++){
            if (charArray[i] < min){
                min = charArray[i];
            }
        }
        System.out.println(min);

    }
}
