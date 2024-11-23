package Chpater09;

public class Exercise1_1 {
    public static void main(String[] args) {
        Animal2 a = new Animal2("K", 11, "cat");
        a.print();
    }
}
class Animal2{

    String name;
    int age;
    String speices;

    //public Animal2(String name1, int age1,String speices1 ){
        //name = "K";
        //age = 11;
        //speices = "cat";
   // }

    public Animal2(String name, int age, String speices){
        this.name = name;
        this.speices = speices;
        this.age = age;
    }



    void print(){
        System.out.println("Name: " + name);
        System.out.println("Age: "+ age);
        System.out.println("Speices: " + speices);
    }
}
