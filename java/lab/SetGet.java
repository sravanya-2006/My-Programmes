package lab;

// Circle class
class Circle {
    private double radius;
    private double diameter;
    private double area;

    public Circle() {
        this.radius = 1;
        calculateValues();
    }

    public void setRadius(double radius) {
        this.radius = radius;
        calculateValues();
    }

    public double getRadius() {
        return radius;
    }

    private void calculateValues() {
        diameter = 2 * radius;
        area = Math.PI * radius * radius;
    }

    public String toString() {
        return "Radius: " + radius + ", Diameter: " + diameter + ", Area: " + area;
    }
}

// TestCircle class
public class SetGet {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("Circle 1: " + circle1.toString());

        Circle circle2 = new Circle();
        circle2.setRadius(5);
        System.out.println("Circle 2: " + circle2.toString());

        Circle circle3 = new Circle();
        circle3.setRadius(10);
        System.out.println("Circle 3: " + circle3.toString());
    }
}
