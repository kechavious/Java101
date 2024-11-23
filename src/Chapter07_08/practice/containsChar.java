package Chapter07_08.practice;

public class containsChar {
    public static void main(String[] args) {

        String phrase = "Hello, world";
        char[] ch = {'o'};

        boolean result = containChar(ch, phrase);

        if (result) {
            System.out.println("The phrase contains at least one of the characters in the array.");
        } else {
            System.out.println("The phrase does not contain any of the characters in the array.");
        }
    }

    public static boolean containChar(char[] ch, String phrase) {
        for (char c : ch) { // Loop through each character in the array
            for (int i = 0; i < phrase.length(); i++) {
                if (phrase.charAt(i) == c) { // Compare each character with the character in the phrase
                    return true; // If found, return true
                }
            }
        }
        return false; // If none of the characters are found, return false
    }
}

