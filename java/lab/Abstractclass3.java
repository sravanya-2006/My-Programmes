package lab;

// Employee abstract class
 abstract class Employee {
    protected String name;
    protected int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public abstract double calculateSalary();

    public String getDetails() {
        return "Name: " + name + ", ID: " + id;
    }
}

// FullTimeEmployee subclass
 class FullTimeEmployee extends Employee {
    private double annualSalary;

    public FullTimeEmployee(String name, int id, double annualSalary) {
        super(name, id);
        this.annualSalary = annualSalary;
    }

    @Override
    public double calculateSalary() {
        return annualSalary;
    }
}

// PartTimeEmployee subclass
 class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String name, int id, int hoursWorked, double hourlyRate) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

// TestEmployee class
public class Abstractclass3 {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("John Doe", 1, 50000);
        System.out.println(fullTimeEmployee.getDetails());
        System.out.println("Salary: " + fullTimeEmployee.calculateSalary());

        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Jane Doe", 2, 40, 20);
        System.out.println(partTimeEmployee.getDetails());
        System.out.println("Salary: " + partTimeEmployee.calculateSalary());
    }
}