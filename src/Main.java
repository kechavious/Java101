public class Main {

    public static int binarySearch(int[] arr, int low, int high, int key) {
        int mid = 0;

        while (low <= high) {
            // find middle index
            mid = (low + high) / 2;

            // compare search key and middle term
            if (key == arr[mid])
                return mid;
            else if (key > arr[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }

        return -1; // key not found
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int key = 80; // search key
        int size = array.length; // array size
        int index = binarySearch(array, 0, size - 1, key);

        // display result
        if (index == -1)
            System.out.println(key + " Not Found");
        else
            System.out.println(key + " Found at Index = " + index);
    }
}

