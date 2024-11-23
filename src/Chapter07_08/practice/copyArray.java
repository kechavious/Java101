package Chapter07_08.practice;

public class copyArray {
    public static void main(String[] args) {
        //copyArray
        // implement a method which takes in an array and
        // returns a newly instantiated copied array.

        int[] originalArray = {1,2,3,4,5,100};
        int[] copiedArray = copyArray(originalArray);

        System.out.println(originalArray);
        System.out.println(copiedArray);

        for (int i : copiedArray) {
            System.out.print(i + ",");
        }
    }

    public static int[] copyArray(int[] originalArray) {
        int[] copyArray = new int[originalArray.length];
        for (int i = 0; i < originalArray.length; i++) {
            copyArray[i] = originalArray[i];
        }
        return copyArray;
    }
}

