package Chapter07_08;

public class ArrayListExercise2 {
    public static void main(String[] args) {
        char[] inputArray = {'A','b','C','d','E'};

        char[] LowerArray = toLower(inputArray);
        char[] UpperArray = toUpper(inputArray);

        for (char c : LowerArray){
            System.out.print(c + ",");
        }
        System.out.println();

        for (char c : UpperArray){
            System.out.print(c + ",");
        }
    }

    public static char[] toLower(char[] arr){
        char[] result1 = new char[arr.length];

        for (int i = 0; i < arr.length; i++){
            result1[i] = Character.toLowerCase(arr[i]);
        }
        return result1;
    }

    public static char[] toUpper(char[] arr){
        char[] result2 = new char[arr.length];

        for (int i = 0; i < arr.length; i++){
            result2[i] = Character.toUpperCase(arr[i]);
        }
        return result2;
    }
}

