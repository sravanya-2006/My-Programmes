package practice;

// Student class with a generic constructor and method
class Student<T> {
    private T age;

    // Generic constructor to initialize age
    public Student(T age) {
        this.age = age;
    }

    // Generic method to return age
    public T studentAge() {
        return age;
    }
}

// Main class to test the Student class
public class Gemero {
    public static void main(String[] args) {
        // Create Student objects with different age types
        Student<Integer> student1 = new Student<>(20);       // Age supplied as Integer
        Student<Float> student2 = new Student<>(21.5f);      // Age supplied as Float
        Student<Double> student3 = new Student<>(22.75);     // Age supplied as Double

        // Display ages of students using studentAge() method
        System.out.println("Age of Student 1: " + student1.studentAge());
        System.out.println("Age of Student 2: " + student2.studentAge());
        System.out.println("Age of Student 3: " + student3.studentAge());
    }
}
