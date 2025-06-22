package practice;

// Faculty class with generic constructor and method
class Faculty<T> {
    private T salary;

    // Generic constructor
    public Faculty(T salary) {
        this.salary = salary;
    }

    // Generic method to display salary
    public T display() {
        return salary;
    }
}

// Main class to demonstrate usage
public class Generic {
    public static void main(String[] args) {
        // Create Faculty objects with different salary types
        Faculty<Integer> faculty1 = new Faculty<>(50000);   // Salary as Integer
        Faculty<Float> faculty2 = new Faculty<>(75000.50f); // Salary as Float
        Faculty<Double> faculty3 = new Faculty<>(100000.75); // Salary as Double

        // Display salaries using generic method
        System.out.println("Salary of Faculty 1: $" + faculty1.display());
        System.out.println("Salary of Faculty 2: $" + faculty2.display());
        System.out.println("Salary of Faculty 3: $" + faculty3.display());
    }
}
