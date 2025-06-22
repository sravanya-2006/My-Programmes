package learn;

interface Animal {
    void eat();
    void sleep();
}

interface Pet {
    void play();
}

class Dog implements Animal, Pet {
    public void eat() {
        System.out.println("Dog is eating");
    }

    public void sleep() {
        System.out.println("Dog is sleeping");
    }

    public void play() {
        System.out.println("Dog is playing");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
        dog.play();
    }
}
