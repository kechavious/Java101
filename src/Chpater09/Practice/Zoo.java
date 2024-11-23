package Chpater09.Practice;

public class Zoo {
    private final static int MAX_CAPACITY = 1000;
    Animal[] animals;
    private int counter = 0;

    public Zoo() {
        // 默认构造函数，不做任何事情
    }


    public Zoo(int numAnimals) {
        animals = new Animal[numAnimals];
        for (int i = 0; i < animals.length; i++) {
            animals[i] = new Animal();
        }
    }

    public void rescureAnimal(Animal animals){
        if (this.counter == MAX_CAPACITY) {
            System.out.println("it is max now.");
        }
        this.animals[counter] = animals;
        this.counter++;

    }

    public void getAmimal(){
        for (Animal a:animals){
            if (a== null){
                break;
            }
        }
    }

    public class Animal {
        public String name;
        private int age; // 假设有一个私有的 age 属性

        // Animal 类的构造函数
        public Animal() {
            // 这里可以进行其他初始化操作
        }

        public Animal(String name, int age){
            this.name = name;
            this.age = age;
        }

        // getter 和 setter 方法用于访问和修改私有属性
        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}


