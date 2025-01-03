package Lats_chapter.Abstract.Shapes;

public class Circle extends Shape{
    protected double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double calculateArea(){
        return Math.PI * Math.pow(this.radius, 2);
    }
}