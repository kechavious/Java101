package Chapter05;

public class Method {
    public static void main(String[] args) {
        System.out.println("A method showing here");
        System.out.println("With static method");

        Cooking c = new Cooking();

        c.name = "Hello";
        c.reci = "byte";

        System.out.println(c.name);
        System.out.println(c.reci);

        inte();

        Cooking2 c2 = new Cooking2();

        c2.name = "hello";

    }

    public static int inte(){
        int i = 10;
        int i1 = 20;
        int result = i + i1;
        return result;
    }

}
class Cooking{
    String name;
    String reci;
}

class Cooking2 extends Cooking{
    String name;

    String reci;
}
