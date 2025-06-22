package practice;

// Interface Tax
interface Tax {
    void printSalary();
    double deduction();
}

// Employee class implementing Tax interface
class Employee implements Tax {
    private int emp_id;
    private String emp_name;
    private String designation;
    private double basic_salary;
    private double hra;
    private double da;
    private double net_salary;

    // Constructor to initialize variables
    public Employee(int emp_id, String emp_name, String designation, double basic_salary, double hra, double da) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.designation = designation;
        this.basic_salary = basic_salary;
        this.hra = hra;
        this.da = da;
        this.net_salary = 0.0; // Initialize net_salary
    }

    // Method to calculate annual income
    public double salary() {
        double gross_salary = basic_salary + hra + da;
        double annual_income = gross_salary * 12;
        return annual_income;
    }

    // Method to calculate income tax
    public double incomeTax(double annual_income) {
        double tax = 0.0;
        if (annual_income <= 500000) {
            tax = 0;
        } else if (annual_income <= 1000000) {
            tax = 0.1 * annual_income; // 10% tax for income between 5 Lakhs to 10 Lakhs
        } else {
            tax = 0.2 * annual_income; // 20% tax for income above 10 Lakhs
        }
        return tax;
    }

    // Method to calculate net salary after deduction
    public double deduction() {
        double annual_income = salary();
        double tax = incomeTax(annual_income);
        net_salary = annual_income - tax;
        return net_salary;
    }

    // Method to print salary details
    public void printSalary() {
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Employee Name: " + emp_name);
        System.out.println("Designation: " + designation);
        System.out.println("Basic Salary: $" + basic_salary);
        System.out.println("HRA: $" + hra);
        System.out.println("DA: $" + da);
        double annual_income = salary();
        System.out.println("Annual Income: $" + annual_income);
        double tax = incomeTax(annual_income);
        System.out.println("Income Tax: $" + tax);
        double net_salary = deduction();
        System.out.println("Net Salary: $" + net_salary);
        System.out.println("-------------------------");
    }
}

// HR class with main method to test Employee class
public class HR {
    public static void main(String[] args) {
        // Create Employee objects
        Employee emp1 = new Employee(101, "John Doe", "Software Engineer", 60000, 10000, 8000);
        Employee emp2 = new Employee(102, "Jane Smith", "Senior Developer", 80000, 12000, 10000);

        // Print salary details
        System.out.println("Salary Slip for Employee 1:");
        emp1.printSalary();

        System.out.println("Salary Slip for Employee 2:");
        emp2.printSalary();
    }
}
