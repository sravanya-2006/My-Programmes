package learn;

import java.io.PrintStream;

public class Objectpassing {
    public static void main(String[] args) {
        Garage garage = new Garage();
        Car car1 = new Car("BMW");
        Car car2 = new Car("Audi");
        garage.park(car1);
        garage.park(car2);
    }
}

class Garage {
    void park(Car car) {
        PrintStream out = System.out;
        out.println("Car " + car.name + " is parked in the garage");
    }
}

class Car {
    String name;

    Car(String name) {
        this.name = name;
    }
}