package Chapter10_Polymorphism.Animal;

/*
 *
 * This class has been altered to include printing out the object reference because we have overridden the toString method in
 * the Animal class (see the Animal class in this same folder on Brightspace)
 * Since every animal inherits Animal, they therefore have an overridden toString method.
 * And since the function getAnimals prints the object reference now, we can see how powerful polymorphism is.
 * A single base class defines an overridden function for all children classes. Another class uses Animal as a parameter
 * to a function, accepting all possible children classes of Animal, and uses the overridden logic of the toString method that
 * was originally inherited by the Object class.
 * This all happens in two locations, one overridden method in the Animal class and one method in the Zoo class.
 *
 */

/*
 *
 * Class Zoo
 * Every Zoo object can only contain a maximum of 1000 animals.
 * This is an example of composition, every Zoo has animals and therefore Animal is a variable of the class Zoo.
 *
 */

public class Zoo {
    private final int ANIMAL_CAPACITY = 1000; // Max capacity
    private int animal_counter; // Counter to keep track of animals
    Animal[] animals; // Animal array

    // Constructor which takes no-args.
    public Zoo(){
        this.animal_counter = 0; // Default start at 0
        this.animals = new Animal[ANIMAL_CAPACITY]; // Initialize the array
    }

    // Method to loop over every animal object and invoke it's getName method
    public void getAnimals(){
        for(int i = 0; i < this.animal_counter; i++){
            System.out.println(this.animals[i]);
        }
    }

    // Method add an animal to our animals array.
    // Uses the counter to ensure we don't go over capacity
    public void rescueAnimal(Animal animal){
        if(this.animal_counter == this.ANIMAL_CAPACITY){
            System.out.println("You've reached max capacity, put the animal somewhere else");
            return;
        }

        this.animals[this.animal_counter++] = animal;
    }

    public static void main(String[] args){
        Zoo zoo = new Zoo();

        // Polymoprihsm in action.
        // Every Cat, Dog and ShihTzu is an Animal object.
        // Therefore we can create a single method, which takes a parameter Animal and pass in all types of animals without having to create a special function per each object type
        zoo.rescueAnimal(new Animal("Gorilla"));
        zoo.rescueAnimal(new Cat("Brandon", 1, "Orange"));
        //zoo.rescueAnimal(new Dog("Kyle", 3, "Rottweiller"));
        //zoo.rescueAnimal(new ShihTzu("Tyler", 14));
    }
}
