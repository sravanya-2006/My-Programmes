package practice;

class Student implements Runnable {
    private String rollNumber;
    private String name;
    private String department;

    public Student(String rollNumber, String name, String department) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.department = department;
    }

    @Override
    public void run() {
        System.out.println("Enrolling student:");
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }
}

public class TechnicalEventRegistration {
    public static void main(String[] args) {
        // Create Student instances
        Student student1 = new Student("101", "Alice", "Computer Science");
        Student student2 = new Student("102", "Bob", "Electrical Engineering");
        Student student3 = new Student("103", "Charlie", "Mechanical Engineering");

        // Create Threads for each student
        Thread thread1 = new Thread(student1);
        Thread thread2 = new Thread(student2);
        Thread thread3 = new Thread(student3);

        // Start the Threads
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

        System.out.println("All students have been enrolled.");
    }
}
