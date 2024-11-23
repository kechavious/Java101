import java.util.Arrays;

class main {
    public static void main(String[] args) {
        int[] rope_length = {5, 10, 7};
        int m = 3;
        int left = 1;
        int right = Arrays.stream(rope_length).max().getAsInt();
        int max_length = 0;


        while (left <= right) {
            int mid = (left + right) / 2;
            int count = 0;
            for (int rope : rope_length) {
                count += rope / mid;
            }
            if (count >= m) {
                max_length = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (max_length > 0) {
            System.out.println("Maximum segment length: " + max_length);
        } else {
            System.out.println("Failed");
        }
    }
}
