package Chapter10_Inheritance;

/*  This class Animal is a template to create new variables of data type Animal.
 *	Every object of type Animal we create is an instance of this template | blueprint | recipe.
 *	Every Animal object will have a name, age and species. This is the object's state.
 *   Every Animal object will have methods declared in the class and execute the written logic in the methods body.
 */

public class Animal { // Class declaration
    // Declare class variables
    // Recall, class variables are variables which belong to the class and not a particular instance (object)
    public static final String KINGDOM = "Animalia"; // Since every Animal is an animal, their KINGDOM should belong to the Animal class and not to a specific object.

    // Declare instance variables
    // Changed to protected so they may be inherited
    protected String name; // Name of the Animal
    protected int age; // Age of the Animal
    protected String species; // Species of the Animal

    public Animal(){ // The default constructor to the Animal class
        // Calls the final constructor which takes an name, age and species argument list.
        // Defaults all values to null, -1 and null.
        // This is known as constructor chaining, calling this() is a syntax to calling another constructor within the same class.
        this(null, -1, null) ;
    }

    public Animal(String species){ // The constructor to the Animal class whch takes in a species arg
        this(null, -1, species); // Calls the final consructor with default args but passes in a species
    }

    public Animal(int age, String species){ // The constructor to the Animal class which takes in an age and species arg
        this(null, age, species); // Calls the final consructor with default args but passes in an age and species
    }

    public Animal(String name, int age, String species){ // The constructor to the Animal class which allows for full initialization of the Animal object
        // The “this” keyword helps reduce ambiguity in the constructor method.
        // Using this refers to the actual instance variable, and says this instance's name is equal to the parameter String name in the method
        // Helps reduce ugly parameter names, reads a whole lot easier than not.
        this.name = name;
        this.age = age;
        this.species = species;
    }

    public String getName(){ return this.name; } // Get method to return the name property
    public void setName(String s){ name = s; } // Set method to assign the name property

    public int getAge(){ return age; } // Get method to return the age property
    public void setAge(int a){ age = a; } // Set method to assign the age property

    public String getSpecies(){ return species; } // Get method to return the species property
    public void setSpecies(String s){ species = s; } // Set method to assign the species property
}