package Chapter07_08;

public class ArrayListExercise1 {
    public static void main(String[] args) {
        //copyArray
        // implement a method which takes in an array and
        // returns a newly instantiated copied array.

        int[] orignialArray = {1,2,3,4,5,100};
        int[] copyArray = CopyArray(orignialArray);

        System.out.println("The elements in Array are: ");
        for (int i : copyArray){
            System.out.print(i + ",");
        }
        System.out.println();
        System.out.println(orignialArray);
        System.out.println(copyArray);


    } public static int[] CopyArray (int[] arr){
        int[] copyArray = new int[arr.length];

        for (int i = 0; i < arr.length; i ++){
            copyArray[i] += arr[i];
        }
        return copyArray;
    }

}
