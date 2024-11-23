package Chapter07_08.practice;

public class ContainsSubString {
    public static void main(String[] args) {

        String phrase = "Hello, world";
        String substring = "world";

        boolean result = containsSubstring(substring, phrase);

        if (result) {
            System.out.println("The phrase contains the substring.");
        } else {
            System.out.println("The phrase does not contain the substring.");
        }
    }

    public static boolean containsSubstring(String substring, String phrase) {
        return phrase.contains(substring);
    }
}
