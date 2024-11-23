package Chpater10_Polymorphsim.Shape;

/*
 *
 * Parent class so every shape can inherit.
 * Only used so we may use polymorphic properties of shapes and pass them into a single function in our Calculator class.
 * Ask your self what would you put here that is generic to all shapes and not specific.
 * We must introudce a function called calculateArea for each child class to override because of declared vs actual type.
 * Since the declared type determines the scope of members this HAS to exist because the function in Calculator now uses a Shape s object
 * Since the actual type will be of (Circle | Rectangle | Square | Cylinder ) the underlying logic executing will be of that defined within the child class.
 */

public class Shape {
    public Shape(){}

    // This is not good practice and we will discover in the next chapter how to better write classes that should serve
    // as a blueprint without logic.
    public double calculateArea(){ return 0.0; }
}