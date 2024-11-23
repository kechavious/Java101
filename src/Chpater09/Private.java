package Chpater09;

public class Private {
    public static void main(String[] args) {
        Animal10 a = new Animal10();
        String name = "Cat";

      a.getName(name);
      a.printName();

    }
}
class Animal10{
    private String name;

    public void getName(String name1){
       name = name1;

    }

    public void printName(){
        System.out.println("NAME: " + name);
    }

}
