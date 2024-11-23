package Chpater09;

public class OOP {
    public static void main(String[] args) {
        //todo 小猫正在抓鱼；
        //   The cat is catching the fish.
      A a = new A();
      a.name = "cat";
      a.ob = "fish";

      a.ex();


    }
}
class A {
    String name;
    String typ = "catch";

    String ob;


    void ex(){
        System.out.println("The " + name + " is " + typ +" "+ ob);
    }
}