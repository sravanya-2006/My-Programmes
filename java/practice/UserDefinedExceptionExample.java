class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void validateAge() throws AgeException {
        if (age < 0 || age > 120) {
            throw new AgeException("Invalid age: " + age + ". Age must be between 0 and 120.");
        }
    }
}

public class UserDefinedExceptionExample {
    public static void main(String[] args) {
        try {
            Person person1 = new Person("Devaratha", 30);
            person1.validateAge();
            System.out.println("Person1: Age validation successful.");
            
            Person person2 = new Person("ajaydevagan", -5);
            person2.validateAge(); 
            System.out.println("Person2: Age validation successful.");
        } catch (AgeException e) {
            System.out.println("Age Exception Caught: " + e.getMessage());
        }
    }
}
