package Chpater09;

public class Exercise2 {
    public static void main(String[] args) {

        int radius = 5;
        Circle c = new Circle();
        c.setRadius(radius);
        c.getArea();
        System.out.println(c.getArea());


        int width = 5;
        int length = 10;
        Rectangle r = new Rectangle();
        r.setLength(length);
        r.setWidth(width);
        r.getArea();
        System.out.println(r.getArea());

    }
}

class Circle{
    int radius;

    public void setRadius(int radius3){
        radius = radius3;
    }

    public double getArea(){
        return 3.14 * Math.pow(radius, 2);
    }

}

class Rectangle{
    int width;
    int length;

    public void setWidth(int width2){
       width = width2;
    }
    public void setLength(int length2){
       length = length2;
    }

    public int getArea(){
        return width * length;
    }
}

