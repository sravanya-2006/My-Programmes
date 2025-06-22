package practice;

// Generic class Employee<T>
class Employee<T> {
    private T empId;
    private String name;
    private float experience;
    private double salary;

    // Constructor
    public Employee(T empId, String name, float experience, double salary) {
        this.empId = empId;
        this.name = name;
        this.experience = experience;
        this.salary = salary;
    }

    // Method to calculate increment based on experience
    public double calculateIncrement() {
        // Extract years and months from experience
        int years = (int) experience;
        int months = (int) ((experience - years) * 10);

        // Calculate increment (experience / 2) % of salary
        double increment = (years + months / 12.0) / 2 * salary / 100;
        return increment;
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Experience: " + experience + " years");
        System.out.println("Salary: $" + salary);
        System.out.println("Increment: $" + calculateIncrement());
        System.out.println();
    }
}

// Main class to test the Employee class
public class TestEmployee {
    public static void main(String[] args) {
        // Create an array of Employee objects with varied data types
        Employee<String> emp1 = new Employee<>("ID1001", "John Doe", 2.5f, 50000);
        Employee<Integer> emp2 = new Employee<>(1002, "Jane Smith", 3.0f, 60000);
        Employee<String> emp3 = new Employee<>("ID1003", "Michael Johnson", 1.8f, 45000);
        Employee<Integer> emp4 = new Employee<>(1004, "Emily Davis", 2.9f, 55000);
        Employee<String> emp5 = new Employee<>("ID1005", "David Brown", 2.1f, 48000);

        // Array of Employee objects
        Employee<?>[] employees = { emp1, emp2, emp3, emp4, emp5 };

        // Display details of each employee
        for (Employee<?> emp : employees) {
            emp.displayEmployeeDetails();
        }
    }
}

