package Chapter06;

public class TestPassByValue {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;

        System.out.println(num1);
        System.out.println(num2);

        swap(num1, num2);

    }
    public static void swap(int num1, int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;


        System.out.println(num1);
        System.out.println(num2);


    }
}
