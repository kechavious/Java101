package Chpater09.exercisethis;

public class Circle {
    // Instance variables
    private double radius;
    private double diameter;

    public Circle(int radius){
        this((double) radius);  // Call the constructor which takes a double and cast the int parameter
    }

    public Circle(float radius){ // Call the constructor which takes a double and cast the float parameter
        this((double) radius);
    }

    public Circle(double radius){
        // Initialize the circle's radius and diameter
        this.radius = radius;
        this.diameter = radius*2;
    }

    public double calculateArea(){ // Method to calculate area
        return this.radius*this.radius*Math.PI;
    }
}
