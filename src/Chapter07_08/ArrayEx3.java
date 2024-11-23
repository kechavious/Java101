package Chapter07_08;

public class ArrayEx3 {
    public static void main(String[] args) {
        int[] arr = {10, 1, 3, 5, 3, 0, 43};


        int sum = Cal(arr);
        double avg = (double) sum / arr.length;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
    }

    public static int Cal(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
