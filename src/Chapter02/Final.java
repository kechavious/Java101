package Chapter02;

public class Final {
    public static void main(String[] args) {
        final double number = 2;
        System.out.println(number);

        /*double number= 5;*/

        //todo 如果说final关键字一出现，那么这个数字后面的值是不能改变的。

        int num = -34 % -5;
        System.out.println(num);


        double integer = Math.pow(2,3.5);
        System.out.println(integer);

        Dog dog = new Dog();
        dog.eat();


    }
}
class Dog{
    void eat(){
        String food = "food";
        System.out.println("The dog are eating");

    }
}
