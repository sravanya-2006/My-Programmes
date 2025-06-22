package lab;

// Define the custom exception class
class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

class MyCalculator {
    public long power(int n, int p) throws NegativeNumberException {
        // Check if either n or p is negative
        if (n < 0 || p < 0) {
            throw new NegativeNumberException("n and p should not be negative.");
        }
        
        // Calculate the power using Math.pow()
        double result = Math.pow(n, p);
        
        // Check if the result is within the range of long
        if (result > Long.MAX_VALUE || result < Long.MIN_VALUE) {
            throw new ArithmeticException("Result is out of range for long data type.");
        }
        
        // Return the result as a long
        return (long) result;
    }
}

public class ExceptionHandling1 {
    public static void main(String[] args) {
        MyCalculator calculator = new MyCalculator(); // Create an instance of MyCalculator
        
        try {
            long result = calculator.power(2, 3); // Call the power method
            System.out.println("Result: " + result);
        } catch (NegativeNumberException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

