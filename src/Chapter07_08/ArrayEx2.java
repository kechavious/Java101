package Chapter07_08;

public class ArrayEx2 {
    public static void main(String[] args) {
        int[] arr = {100,10, 1, 3, 5, 3, 0, 43};

        int[] maxIndex = findMaxIndex(arr);
        int[] minIndex = findMinIndex(arr);

        System.out.print("Indices of maximum element(s): ");
        for (int index : maxIndex) {
            System.out.print(index + " ");
        }
        System.out.println();

        System.out.print("Indices of minimum element(s): ");
        for (int index : minIndex) {
            System.out.print(index + " ");
        }
        System.out.println();
    }

    public static int[] findMaxIndex(int[] arr) {
        int max = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return new int[]{max};
    }

    public static int[] findMinIndex(int[] arr) {
        int min = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[min]) {
                min = i;
            }
        }

        return new int[]{min};
    }
}

