package Chpater10_Polymorphsim.Shape;

/*
 *	This class is a recipe to create Circles
 *	Every circle has a radius
 *   With that radius we can calculate the area using a variable PI from the Math class
 */

public class Circle extends Shape{
    // Instance variables
    private double radius;
    private double diameter;

    public Circle(double radius){
        // Initialize the circle's radius and diameter
        this.radius = radius;
        this.diameter = radius*2;
    }

    public double calculateArea(){ // Method to calculate area
        return this.radius*this.radius*Math.PI;
    }
}
