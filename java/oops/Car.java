package oops;

public class Car {

    String make = "Chevrolet";
    String model = "Corvette";
    int year = 2023;
    String color = "blue";
    double price = 5000000.00;

    void drive() {
        System.out.println("You drive the car");
    }
    
    void brake() {
        System.out.println("Step on the brake");
    }
}

class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        System.out.println(myCar.model);
    }
}
