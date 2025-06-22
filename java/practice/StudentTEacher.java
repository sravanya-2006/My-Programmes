package practice;

// Student interface
interface Student {
    String department = "CSE"; // Default department for all students
    
    void setStudentDetails(String registerNo, String name, String address);
    void printStudentDetails();
}

// Faculty interface
interface Faculty {
    String designation = "Assistant Professor"; // Default designation for all faculty
    
    void setFacultyDetails(String name, String department, float salary);
    void printFacultyDetails();
}

// University class implementing both Student and Faculty interfaces
class University implements Student, Faculty {
    private String studentRegisterNo;
    private String studentName;
    private String studentAddress;
    
    private String facultyName;
    private String facultyDepartment;
    private float facultySalary;
    
    // Implementing methods from Student interface
    @Override
    public void setStudentDetails(String registerNo, String name, String address) {
        this.studentRegisterNo = registerNo;
        this.studentName = name;
        this.studentAddress = address;
    }
    
    @Override
    public void printStudentDetails() {
        System.out.println("Student Details:");
        System.out.println("Register No: " + studentRegisterNo);
        System.out.println("Name: " + studentName);
        System.out.println("Address: " + studentAddress);
        System.out.println("Department: " + Student.department);
    }
    
    // Implementing methods from Faculty interface
    @Override
    public void setFacultyDetails(String name, String department, float salary) {
        this.facultyName = name;
        this.facultyDepartment = department;
        this.facultySalary = salary;
    }
    
    @Override
    public void printFacultyDetails() {
        System.out.println("Faculty Details:");
        System.out.println("Name: " + facultyName);
        System.out.println("Department: " + facultyDepartment);
        System.out.println("Designation: " + Faculty.designation);
        System.out.println("Salary: $" + facultySalary);
    }
}

public class StudentTEacher {
    public static void main(String[] args) {
        // Create an instance of University
        University university = new University();
        
        // Set student details
        university.setStudentDetails("2023001", "Alice", "123 Main St, Anytown");
        
        // Set faculty details
        university.setFacultyDetails("Dr. Bob", "Computer Science", 75000);
        
        // Print student and faculty details
        university.printStudentDetails();
        System.out.println();
        university.printFacultyDetails();
    }
}
