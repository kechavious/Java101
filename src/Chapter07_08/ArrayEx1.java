package Chapter07_08;

public class ArrayEx1 {
    public static void main(String[] args) {
        int[] arr = {10,1,3,5,3,0,43};

//        for (int i = 0; i < arr.length - 1; i ++){
//            System.out.println(arr[i]);
//        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (max < arr[i]){
                max = arr[i];
            }
        }

        int min = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (min > arr[i]){
                min = arr[i];
            }
        }

        System.out.println(max);
        System.out.println(min);

    }
}
