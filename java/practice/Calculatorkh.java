package practice;

// Calculator class with generics
class Calculator<T extends Number> {
    private T number1;
    private T number2;
    private T number3;

    // Constructor
    public Calculator(T x, T y, T z) {
        this.number1 = x;
        this.number2 = y;
        this.number3 = z;
    }

    // Addition method
    public double addition() {
        double result = number1.doubleValue() + number2.doubleValue() + number3.doubleValue();
        return result;
    }

    // Multiplication method
    public double multiplication() {
        double result = number1.doubleValue() * number2.doubleValue() * number3.doubleValue();
        return result;
    }

    // Solve expression method
    public double solveExpression() {
        double result = number1.doubleValue() + number2.doubleValue() - number3.doubleValue();
        return result;
    }
}

public class Calculatorkh {
    public static void main(String[] args) {
        // Example usage for Integer type
        Calculator<Integer> intCalculator = new Calculator<>(5, 3, 2);
        System.out.println("Integer Addition Result: " + intCalculator.addition());
        System.out.println("Integer Multiplication Result: " + intCalculator.multiplication());
        System.out.println("Integer Expression Result: " + intCalculator.solveExpression());

        // Example usage for Double type
        Calculator<Double> doubleCalculator = new Calculator<>(5.5, 3.2, 1.7);
        System.out.println("\nDouble Addition Result: " + doubleCalculator.addition());
        System.out.println("Double Multiplication Result: " + doubleCalculator.multiplication());
        System.out.println("Double Expression Result: " + doubleCalculator.solveExpression());
    }
}
