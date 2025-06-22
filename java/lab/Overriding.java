package lab;

// Base class Animal
class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Subclass Dog
class Dog extends Animal {
    private String breed;

    public Dog(String name, String breed) {
        super(name); // constructor chaining
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public String toString() {
        return "Dog: " + getName() + ", Breed: " + breed;
    }
}

// Main class
public class Overriding {
    public static void main(String[] args) {
        Dog myDog = new Dog("Fido", "Golden Retriever");
        System.out.println(myDog.toString());
    }
}
