package Assignment4;

public class Animal{
    public static void main(String[] args) {

    }
    //todo these are the class variables that using static or nothing and
    //  it's modifiers are private;
    private static final String DOMAIN = "DOMAIN";
    private static String KINGDOM = "KINGDOM";
    private String phlyum;
    private String taxonomicalClass;
    private String order;
    private String family ;
    private String genus;
    private String species;
    private String subspecies;
    private String name;
    private int age;

    //todo 5 Constructor;
    public Animal(String phylum, String taxonomicalClass, String order, String family, String genus, String species, String subSpecies, String name, int age) {
        this.phlyum = phylum;
        this.taxonomicalClass = taxonomicalClass;
        this.order = order;
        this.family = family;
        this.genus = genus;
        this.species = species;
        this.subspecies = subSpecies;
        this.name = name;
        this.age = age;
    }

    public Animal(String phylum, String taxonomicalClass, String order, String family, String genus, String species, String subSpecies, String name) {
        this(phylum, taxonomicalClass, order, family, genus, species, subSpecies, name, -1);
    }

    public Animal(String phylum, String taxonomicalClass, String order, String family, String genus, String species, String subSpecies) {
        this(phylum, taxonomicalClass, order, family, genus, species, subSpecies, null, -1);
    }

    public Animal(String phylum, String taxonomicalClass, String order, String family, String genus, String species){
        this(phylum, taxonomicalClass, order, family, genus, species, null, null, -1);
    }


    // todo the instance method and set age and name method;
    public String getPhlyum(){
        return phlyum;
    }
    public String gettaxonomicalclass(){
        return taxonomicalClass;
    }
    public String getOrder(){
        return order;
    }

    public String getFamily(){
        return family;
    }
    public String getGenus(){
        return genus;
    }
    public String getSpecies(){
        return species;
    }
    public String getSubspecies(){
        return subspecies;
    }

    public String getName(){
        return name;
    }
    public void setname(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
}
