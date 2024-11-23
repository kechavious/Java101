package Chapter10_Inheritance;

/*
 *
 * Re-using the Cat example, see how much of our code is now reduced.
 * KINGDOM, species, name, age are all inherited.
 * Likewise we now have access to the word super, which allows us to call the constructor of our parent class Animal.
 * This allows us to reduce code that sets the same variables since the Animal class has constructors we can reuse.
 */

public class Cat extends Animal { // Class declaration and extension
    // Declare class variables
    public static final String PHLYUM = "Chordata";
    public static final String T_CLASS = "Mammalia";
    public static final String ORDER = "Carnivora";
    public static final String FAMILY = "Felidae";
    public static final String GENUS = "Felis";
    public static final String SPECIES = "F catus";

    // Declare instance variables
    private String color; // Color of the Cat

    public Cat(String name, int age, String color){
        /*
         *   This calls the constructor in our Animal class
         *        public Animal(String name, int age, String species){
         *           this.name = name;
         *           this.age = age;
         *           this.species = species;
         *       }
         *
         *   This sets the propeties name, age and species within the object derived from the Cat class.
         */
        super("Unknown", -1, Cat.SPECIES);
        this.color = color;
    }

    public void makeSound(){
        System.out.println("Meow");
    }
}