package Chapter01;

public class Hello_word {
    public static void main(String[] args) {
        System.out.println(Hw.println());
        User01 u1 = new User01();
        System.out.println(u1.print());
    }
}
class Hw{
    public static String println(){
        return "Hello, world";
    }
}
class User01 extends Hw{
    public String print(){
        return "Hi ,Java";
    }
}