package lab;

public class Overloading {
    public double compute(double price) {
        // Add 2% tax
        return price * 1.02;
    }

    public double compute(double price, int quantity) {
        // Calculate total price
        double totalPrice = price * quantity;
        // Add 2% tax
        return totalPrice * 1.02;
    }

    public double compute(double price, int quantity, double coupon) {
        // Calculate total price
        double totalPrice = price * quantity;
        // Reduce by coupon value
        totalPrice -= coupon;
        // Add 2% tax
        return totalPrice * 1.02;
    }

    public static void main(String[] args) {
        Overloading calculator = new Overloading();

        // Test compute() with one parameter
        double result1 = calculator.compute(20.0);
        System.out.println("Total due for 1 book: $" + String.format("%.2f", result1));

        // Test compute() with two parameters
        double result2 = calculator.compute(20.0, 3);
        System.out.println("Total due for 3 books: $" + String.format("%.2f", result2));

        // Test compute() with three parameters
        double result3 = calculator.compute(20.0, 3, 5.0);
        System.out.println("Total due for 3 books with $5 coupon: $" + String.format("%.2f", result3));
    }
}
