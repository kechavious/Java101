package Chpater10_Polymorphsim.Shape;

/*
 *	This class is a recipe to create Rectangles
 *	Every rectangle has a length and width
 *   With that length and width we can calculate the area of the rectangle
 */

public class Rectangle extends Shape {
    // Instance variables
    private double length;
    private double width;

    public Rectangle(double length, double width){
        // Initializes the length and width of the rectangle
        this.length = length;
        this.width = width;
    }

    public double calculateArea(){ // Calculate area
        return this.width*this.length;
    }
}