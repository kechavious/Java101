package Chpater09;

public class Exercise2_2 {
    public static void main(String[] args) {
        int radius = 5;
        Circle1 c = new Circle1(radius);
        System.out.println(c.Area());

    }
}
class Circle1{
    public int radius;

    public Circle1(int radius){
        this.radius = radius;
    }

    public double Area(){
        return (3.14 * Math.pow(radius, 2));
    }

}
