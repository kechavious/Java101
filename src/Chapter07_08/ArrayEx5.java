package Chapter07_08;

public class ArrayEx5 {
    public static void main(String[] args) {
        String sen = "Hello, World";

        char[] chars = {'o'};

        for (char ch : chars) {
            if (sen.indexOf(ch) != -1) {
                System.out.println(ch + " is not in the chars");
            } else {
                System.out.println(ch + " is in the chars");
            }
        }
    }
}

