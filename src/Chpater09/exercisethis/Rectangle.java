package Chpater09.exercisethis;

public class Rectangle {
    // Instance variables
    private double length;
    private double width;

    public Rectangle(int length, int width){
        this((double) length, (double) width); // Call the constructor which takes doubles and cast the int parameters
    }

    public Rectangle(float length, float width){
        this((double) length, (double) width); // Call the constructor which takes doubles and cast the float parameters
    }

    public Rectangle(double length, double width){
        // Initializes the length and width of the rectangle
        this.length = length;
        this.width = width;
    }

    public double calculateArea(){ // Calculate area
        return this.width*this.length;
    }
}