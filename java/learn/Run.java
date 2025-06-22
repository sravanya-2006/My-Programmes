package learn;
class Vehicle {
    public void start() {
        System.out.println("Vehicle starting...");
    }
}
class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Car starting...");
    }
}

public class Run {
    public static void main(String[] args) {
        Vehicle car = new Vehicle();
        car.start(); 
    }
}


