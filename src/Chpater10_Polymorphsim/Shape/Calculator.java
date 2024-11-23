package Chpater10_Polymorphsim.Shape;

/*
 *  This class was rewritten to have a single method, calculateArea which takes in a Shape object as a parameter rather
 *  than invidual shape objects. SInce the base class Shape, has a method calculateArea this allows the passed in parameter
 *  to compile correctly but execute the correct area method accoridng to the actual type of the parameter.
 *
 */

/*
 *  Class Calculator
 *  This is a static class because all members are static. Not to be confused with declaring the class itself static.
 *  This class can not be instantiated due to the private constructor
 *  This class has methods calculateArea which takes a shape object and invokes the object's method calculateArea.
 *  This is an example of a wrapper method, calculateArea which invokes calculateArea.
 *
 */

public class Calculator {
    public static double calculateArea(Shape s){
        return s.calculateArea();
    }

    /*
     * Private constructor
     * I don't want anyone to create this object
     */
    private Calculator(){}
}