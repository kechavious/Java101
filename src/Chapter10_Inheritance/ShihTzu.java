package Chapter10_Inheritance;

/*
 *
 * Re-using the ShihTzu example, see how much of our code is now reduced.
 * KINGDOM, species, name, age are all inherited.
 * Likewise we now have access to the word super, which allows us to call the constructor of our parent class Animal.
 * This allows us to reduce code that sets the same variables since the Animal class has constructors we can reuse.
 */

public class ShihTzu extends Dog { // Class declaration and extension
    // Declare class variables
    public static final String BREED = "ShihTzu";

    public ShihTzu(String name, int age){
        /*
         *   This calls the constructor in our Dog class
         *        public Dog(String name, int age, String breed){
         *           super("Unknown", -1, Dog.SPECIES);
         *           this.species = species;
         *       }
         *
         *   This sets the propeties name, age and species and breed within the object derived from the ShihTzu class.
         */
        super(name, age, ShihTzu.BREED);
    }
}