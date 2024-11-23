package Chapter07_08.practice;

public class findIndexOfMaxMin {
    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 9, 7, 0 ,100};

        int maxIndex = findMax(arr);
        int minIndex = findMin(arr);

        System.out.println("Max value: " + arr[maxIndex] + " at index: " + maxIndex);
        System.out.println("Min value: " + arr[minIndex] + " at index: " + minIndex);
    }

    public static int findMax(int[] arr) {
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static int findMin(int[] arr) {
        int minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }
}
