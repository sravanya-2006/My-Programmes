package practice;

class ShapeArea {
    double area;

    // Constructor for rectangle (x and y are sides)
    public ShapeArea(double x, double y) {
        this.area = x * y;
        System.out.println("Area of Rectangle with sides " + x + " and " + y + " is: " + area);
    }

    // Constructor for square (x is side)
    public ShapeArea(double x) {
        this(x, x); // Calls the rectangle constructor with both sides as x
        System.out.println("Area of Square with side " + x + " is: " + area);
    }

    // Constructor for circle (y is radius)
    public ShapeArea(int dummy, double y) {
        this(Math.PI, y); // Calls the circle constructor with pi as x and radius as y
        System.out.println("Area of Circle with radius " + y + " is: " + area);
    }

    // Constructor for circle (x is pi and y is radius)
    public ShapeArea(double x, double y) {
        this.area = x * y * y;
    }
}

public class CalculateAreas {
    public static void main(String[] args) {
        ShapeArea shape = new ShapeArea(4, 5); // Rectangle with sides 4 and 5
        ShapeArea shape2 = new ShapeArea(6);   // Square with side 6
        ShapeArea shape3 = new ShapeArea(3.14, 7); // Circle with radius 7
    }
}
