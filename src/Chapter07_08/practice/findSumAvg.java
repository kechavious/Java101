package Chapter07_08.practice;

public class findSumAvg {
    public static void main(String[] args) {
        int[] arr = {3, 5, 4, 1, 2, 7};

        int sum = findSum(arr);

        double avg = (double)sum / arr.length-1;

        System.out.println(sum);
        System.out.println(avg);
    }

    public static int findSum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }
}
