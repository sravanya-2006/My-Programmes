package practice;

// Employee class
class Employee {
    private String name;
    private int id;
    private double basicSalary;
    private double da;
    private double hra;

    // Constructor
    public Employee(String name, int id, double basicSalary) {
        this.name = name;
        this.id = id;
        this.basicSalary = basicSalary;
        this.da = 0.31 * basicSalary; // DA is 31% of basicSalary
        this.hra = 0.10 * basicSalary; // HRA is 10% of basicSalary
    }

    // Method to calculate gross salary
    public double calculateGrossSalary() {
        return basicSalary + da + hra;
    }

    // Getters for attributes
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public double getDa() {
        return da;
    }

    public double getHra() {
        return hra;
    }
}

// Runnable task to process each employee
class EmployeeTask implements Runnable {
    private Employee employee;

    public EmployeeTask(Employee employee) {
        this.employee = employee;
    }

    @Override
    public void run() {
        System.out.println("Calculating Gross Salary for Employee: " + employee.getName());

        // Printing employee details
        System.out.println("Employee ID: " + employee.getId());
        System.out.println("Basic Salary: $" + employee.getBasicSalary());
        System.out.println("DA: $" + employee.getDa());
        System.out.println("HRA: $" + employee.getHra());

        // Calculating and printing gross salary
        double grossSalary = employee.calculateGrossSalary();
        System.out.println("Gross Salary: $" + grossSalary);

        // Sleep for 1000ms
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

// Driver class to test multithreaded application
public class MultipleThreadImplementation {
    public static void main(String[] args) {
        // Create three Employee objects
        Employee emp1 = new Employee("John Doe", 101, 50000);
        Employee emp2 = new Employee("Jane Smith", 102, 60000);
        Employee emp3 = new Employee("Michael Johnson", 103, 70000);

        // Create threads for each employee
        Thread thread1 = new Thread(new EmployeeTask(emp1));
        Thread thread2 = new Thread(new EmployeeTask(emp2));
        Thread thread3 = new Thread(new EmployeeTask(emp3));

        // Start threads
        thread1.start();
        thread2.start();
        thread3.start();

        // Wait for all threads to complete
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All threads completed.");
    }
}
