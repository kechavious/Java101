package Chapter07_08.practice;

public class findMaxMin {
    public static void main(String[] args) {
        int[] arr = {2,4,3,5,0};


        int max = 0;
        for(int i =0; i < arr.length; i++){
            if (max < arr[i]){
                max = arr[i];
            }
        }

        int min = 0;
        for (int i = 0; i < arr.length; i ++){
            if (min > arr[i]){
                min = arr[i];
            }
        }

        System.out.println(max);
        System.out.println(min);



    }
}
