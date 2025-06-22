package lab;

// Abstract class Shape
abstract class Shape {
    abstract double calculateArea();
}

// Subclass Circle
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Subclass Rectangle
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }
}

// Test class
public class Abstractclass {
    public static void main(String[] args) {
        // Create a Circle object
        Circle circle = new Circle(5.0);
        System.out.println("Circle area: " + circle.calculateArea());

        // Create a Rectangle object
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        System.out.println("Rectangle area: " + rectangle.calculateArea());
    }
}
