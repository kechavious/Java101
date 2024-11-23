package Chpater09.exercisethis;

public class CalculateArea {
    public static double getCircleArea(Circle c){
        return c.calculateArea();
    }
    public static double getRetangleArea(Rectangle r){
        return r.calculateArea();
    }


    public static void main(String[] args) {
        Circle c = new Circle(1);

        Rectangle r = new Rectangle(1,1);

        System.out.println(c.calculateArea());

        System.out.println(r.calculateArea());
    }
}
