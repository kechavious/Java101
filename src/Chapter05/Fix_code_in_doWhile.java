package Chapter05;

public class Fix_code_in_doWhile {
    public static void main(String[] args) {
        int sum = 0; // Declare sum
        int j = 0; // Declare j

        for (int i = 0; i < 10; i++) {
            sum += i;

            if (i < j) {
                System.out.println(i);
            } else {
                System.out.println(j);
            }
        }

        while (j < 10) {
            j++;
        }

        do {
            j++;
        } while (j < 10);
    }
}
