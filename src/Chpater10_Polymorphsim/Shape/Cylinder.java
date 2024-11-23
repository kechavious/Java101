package Chpater10_Polymorphsim.Shape;

/*
 *	This class is a recipe to create Circles
 *	Every circle has a radius
 *   With that radius we can calculate the area using a variable PI from the Math class
 */

public class Cylinder extends Shape {
    // Instance variables
    private double radius;
    private double height;

    public Cylinder(double radius, double height){
        // Initialize the circle's radius and diameter
        this.radius = radius;
        this.height = height;
    }

    public double calculateArea(){ // Method to calculate area
        return (2*Math.PI*this.radius*this.height) + (2*Math.PI*Math.pow(this.radius, 2));
    }
}
