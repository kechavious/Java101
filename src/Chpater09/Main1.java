package Chpater09;

public class Main1 {
    public static void main(String[] args) {
        Animal01 a = new Animal01();
        System.out.println(a.getName());
        System.out.println(a.getAge());
        System.out.println(a.getType());
    }
}
class Animal01{
    public String name;
    private int age;
    String type = "x";

    public String getName(){
        return name = "Dog";
    }

    public int getAge(){
        return this.age = 10;
    }

    public String getType(){
        return type;
    }

}

