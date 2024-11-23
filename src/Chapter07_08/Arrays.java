package Chapter07_08;

public class Arrays {
    public static void main(String[] args) {
        // todo 数组
        // creat a array

        int[] arr = new int[10];

        System.out.println(arr[0]);

        arr[0] = 0;

        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        // todo if the arrays should be have value, they should be using the loop to assing the value,
        //  or they will just a memorry address.

        for (int num: arr){
            System.out.println(arr[num]);
        }


    }
}
