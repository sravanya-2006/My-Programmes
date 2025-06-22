package lab;

// Vehicle class (superclass)
class Vehicle {
    private int wheels;
    private double milesPerGallon;

    public Vehicle(int wheels, double milesPerGallon) {
        this.wheels = wheels;
        this.milesPerGallon = milesPerGallon;
    }

    public String toString() {
        return "Wheels: " + wheels + ", Miles per Gallon: " + milesPerGallon;
    }
}

// Car class (subclass)
class Car extends Vehicle {
    public Car(double milesPerGallon) {
        super(4, milesPerGallon);
    }
}

// MotorCycle class (subclass)
class MotorCycle extends Vehicle {
    public MotorCycle(double milesPerGallon) {
        super(2, milesPerGallon);
    }
}

// UseVehicle class
public class Inheritance2 {
    public static void main(String[] args) {
        Car myCar = new Car(25.0);
        MotorCycle myMotorCycle = new MotorCycle(40.0);

        System.out.println("Car: " + myCar.toString());
        System.out.println("MotorCycle: " + myMotorCycle.toString());
    }
}
