package Chapter10_Polymorphism.Animal;

/*
 * See the overridden setSpecies method.
 * Since every Cat is always a Cat and cannot change species.. we should override the logic where we print to the screen, sorry cant change species.
 * This protects our Cat object from changing species anywhere in our program once set.
 * Alternatively, we can also "hide" the variable species by declaring a new species variable and setting it to final.
 */

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

    // HIDES the species variable from Animal class.
    // Not recommended to do, but this is an edge case.
    public final String species = Cat.SPECIES;

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

    @Override
    public void setSpecies(String species){ return; }
}