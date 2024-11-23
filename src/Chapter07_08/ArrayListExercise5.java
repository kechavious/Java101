package Chapter07_08;

public class ArrayListExercise5 {
    public static void main(String[] args) {
       char[] orgArray = {'a', 'b', 'c', 'd', 'e'};
       char[] encryptArray = encrpy(orgArray);
       char[] DecryptArray = decry(encryptArray);

        System.out.println(orgArray);


        System.out.print(encryptArray);
        System.out.println();
        System.out.print(DecryptArray);
    }
    public static char[] encrpy(char[] orgArray){
        char[] encryptArray = new char[orgArray.length];
        for (int i = 0; i < orgArray.length; i++){
            encryptArray[i] = (char)(orgArray[i]  + 3);
        }
        return encryptArray;
    }

    public static char[] decry(char[] encryptArray){
        char[] decryptArray = new char[encryptArray.length];
        for (int i = 0; i < encryptArray.length; i++){
            decryptArray[i] = (char)(encryptArray[i] - 3);
        }
        return decryptArray;
    }
}
