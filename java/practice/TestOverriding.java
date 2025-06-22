package practice;

// Base class SchoolKid
class SchoolKid {
    private String name;
    private int age;
    private String teacherName;
    private String greeting;

    // Constructor
    public SchoolKid(String name, int age, String teacherName, String greeting) {
        this.name = name;
        this.age = age;
        this.teacherName = teacherName;
        this.greeting = greeting;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getter and Setter for teacherName
    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    // Getter and Setter for greeting
    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}

// Derived class ExaggeratingKid
class ExaggeratingKid extends SchoolKid {

    // Constructor
    public ExaggeratingKid(String name, int age, String teacherName, String greeting) {
        super(name, age, teacherName, greeting);
    }

    // Overridden getter for age
    @Override
    public int getAge() {
        return super.getAge() + 2;
    }

    // Overridden getter for greeting
    @Override
    public String getGreeting() {
        return super.getGreeting() + " I am the Best";
    }
}

// Driver class to test the overriding
public class TestOverriding {
    public static void main(String[] args) {
        // Create a SchoolKid object
        SchoolKid kid1 = new SchoolKid("Alice", 10, "Mrs. Smith", "Hello!");
        // Create an ExaggeratingKid object
        ExaggeratingKid kid2 = new ExaggeratingKid("Bob", 10, "Mr. Johnson", "Hi!");

        // Display the details of SchoolKid
        System.out.println("SchoolKid Details:");
        System.out.println("Name: " + kid1.getName());
        System.out.println("Age: " + kid1.getAge());
        System.out.println("Teacher: " + kid1.getTeacherName());
        System.out.println("Greeting: " + kid1.getGreeting());

        // Display the details of ExaggeratingKid
        System.out.println("\nExaggeratingKid Details:");
        System.out.println("Name: " + kid2.getName());
        System.out.println("Age: " + kid2.getAge());
        System.out.println("Teacher: " + kid2.getTeacherName());
        System.out.println("Greeting: " + kid2.getGreeting());
    }
}

