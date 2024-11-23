package Chapter07_08.practice;

public class toUpperLower {
    public static void main(String[] args) {
        char[] orgArray = {'a', 'B', 'c', 'D', 'e'};

        char[] toUpper = Upper(orgArray);
        char[] toLower = Lower(orgArray);

        for (char ch : toUpper){
            System.out.print(ch + " ");
        }
        System.out.println();
        for (char ch : toLower){
            System.out.print(ch + " ");
        }
    }
    public static char[] Upper(char[] orgArray){
        char[] Toupper = new char[orgArray.length];

        for (int i = 0; i < Toupper.length; i ++){
            Toupper[i] = Character.toUpperCase(orgArray[i]);
        }
        return Toupper;
    }

    public static char[] Lower(char[] orgArray){
        char[] Tolower = new char[orgArray.length];

        for (int i = 0; i < Tolower.length; i++){
            Tolower[i] = Character.toLowerCase(orgArray[i]);
        }
        return Tolower;
    }
}
