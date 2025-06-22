package learn;

 // method overriding = Declaring a method in sub class, 
 // which is already present in parent class.
 // done so that a child class can give its own implementation.

class Animal {
    void speak() {
        System.out.println("Animal speaks");
    }
}

class Dog extends Animal {
    @Override
    void speak() {
        System.out.println("Dog barks");
    }
}

public class overriding {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.speak(); // This should print "Dog barks"
    }
}

