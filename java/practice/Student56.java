package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

class Student {
    private int registerNumber;
    private String name;
    private String department;
    private String university;

    public Student(int registerNumber, String name, String department, String university) {
        this.registerNumber = registerNumber;
        this.name = name;
        this.department = department;
        this.university = university;
    }

    public static void Display_Details(Map<Integer, Student> students) {
        System.out.println("Details of all students:");
        Iterator<Map.Entry<Integer, Student>> iterator = students.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Student> entry = iterator.next();
            Student student = entry.getValue();
            System.out.println("Register Number: " + student.registerNumber);
            System.out.println("Name: " + student.name);
            System.out.println("Department: " + student.department);
            System.out.println("University: " + student.university);
            System.out.println("----------------------");
        }
    }
}

public class Student56 {
    public static void main(String[] args) {
        // Create 5 Student objects and store in Map
        Map<Integer, Student> studentMap = new HashMap<>();
        studentMap.put(101, new Student(101, "Alice", "Computer Science", "XYZ University"));
        studentMap.put(102, new Student(102, "Bob", "Electrical Engineering", "ABC University"));
        studentMap.put(103, new Student(103, "Charlie", "Mechanical Engineering", "DEF University"));
        studentMap.put(104, new Student(104, "David", "Physics", "GHI University"));
        studentMap.put(105, new Student(105, "Eve", "Mathematics", "JKL University"));

        // Display details of all students
        Student.Display_Details(studentMap);
    }
}
