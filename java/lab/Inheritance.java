package lab;


    // Abstract class Person
abstract class Person {
    private String name;
    private String gender;

    public Person(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Gender: " + gender;
    }
}

// Class Student
class Student extends Person {
    private String college;
    private double gpa;
    private int yearInSchool;

    public Student(String name, String gender, String college, double gpa, int yearInSchool) {
        super(name, gender);
        this.college = college;
        this.gpa = gpa;
        this.yearInSchool = yearInSchool;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public double getGPA() {
        return gpa;
    }

    public void setGPA(double gpa) {
        this.gpa = gpa;
    }

    public int getYearInSchool() {
        return yearInSchool;
    }

    public void setYear(int yearInSchool) {
        this.yearInSchool = yearInSchool;
    }

    @Override
    public String toString() {
        return super.toString() + ", College: " + college + ", GPA: " + gpa + ", Year in School: " + yearInSchool;
    }
}

// Class Faculty
class Faculty extends Person {
    private String rank;
    private String department;
    private double salary;

    public Faculty(String name, String gender, String rank, String department, double salary) {
        super(name, gender);
        this.rank = rank;
        this.department = department;
        this.salary = salary;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + ", Rank: " + rank + ", Department: " + department + ", Salary: " + salary;
    }
}

// Class Staff
class Staff extends Person {
    private double salary;
    private int vacation;

    public Staff(String name, String gender, double salary, int vacation) {
        super(name, gender);
        this.salary = salary;
        this.vacation = vacation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getVacation() {
        return vacation;
    }

    public void setVacation(int vacation) {
        this.vacation = vacation;
    }

    @Override
    public String toString() {
        return super.toString() + ", Salary: " + salary + ", Vacation: " + vacation;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Student student = new Student("John Doe", "Male", "GW College", 3.5, 2);
        Faculty faculty = new Faculty("Jane Smith", "Female", "Professor", "Computer Science", 100000.0);
        Staff staff = new Staff("Bob Johnson", "Male", 50000.0, 10);

        System.out.println("Student: " + student.toString());
        System.out.println("Faculty: " + faculty.toString());
        System.out.println("Staff: " + staff.toString());
    }
}


