package Chpater10_Polymorphsim.Shape;

/*
 *	This class is a recipe to create Square
 *	Every square has a length and width
 *   With that length and width we can calculate the area of the square.
 *
 *   You should be thinking about how to make this class less redundant. Every square is a rectangle..
 *
 */

public class Square extends Shape {
    // Instance variables
    private double length;
    private double width;

    public Square(double length, double width){
        // Initializes the length and width of the rectangle
        this.length = length;
        this.width = width;
    }

    public double calculateArea(){ // Calculate area
        return this.width*this.length;
    }
}
