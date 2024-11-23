package Chapter07_08.practice;

public class encryptCharArray {
    public static void main(String[] args) {
        char[] arr = {'a','b','c','d','e'};

        char[] enarr = Encrypt(arr);

        for (char ch : enarr){
            System.out.print(ch + " ");
        }

    }
    public static char[] Encrypt(char[] arr){
        char[] arr2 = new char[arr.length];

        for (int i = 0; i < arr2.length; i ++){
            arr2[i] = (char)(arr[i] + 3);
        }
        return arr2;
    }
}
