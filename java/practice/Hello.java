package practice;

// Student class implementing Runnable interface
class Student implements Runnable {
    private int rollNumber;
    private String name;
    private String department;

    // Constructor to initialize roll number, name, and department
    public Student(int rollNumber, String name, String department) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.department = department;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println();
    }

    // Override run method from Runnable interface
    @Override
    public void run() {
        // Simulating registration process
        System.out.println(name + " is registering for the technical event...");
        // Display student details
        displayDetails();
    }
}

// Main class to test the Student threads
public class TestStudents {
    public static void main(String[] args) {
        // Create three Student objects with roll number, name, and department
        Student student1 = new Student(101, "Alice", "Computer Science");
        Student student2 = new Student(102, "Bob", "Electrical Engineering");
        Student student3 = new Student(103, "Carol", "Mechanical Engineering");

        // Create threads for each student
        Thread thread1 = new Thread(student1);
        Thread thread2 = new Thread(student2);
        Thread thread3 = new Thread(student3);

        // Start the threads
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
