

public class MyClass {
    private int number; // Private integer field
    private String text; // Private string field

    // Default constructor
    MyClass() {
        number = 0;
        text = "Default";
    }

    // Parameterized constructor
    MyClass(int number, String text) {
        this.number = number;
        this.text = text;
    }

    // Constructor overloading
    MyClass(int number) {
        this.number = number;
        this.text = "Overloaded";
    }

    // Getter methods
    int getNumber() {
        return number;
    }

    String getText() {
        return text;
    }

    public static void main(String[] args) {
        // Instantiating objects using different constructors
        MyClass obj1 = new MyClass(); // Default constructor
        MyClass obj2 = new MyClass(10, "Hello"); // Parameterized constructor
        MyClass obj3 = new MyClass(5); // Overloaded constructor

        // Printing object properties
        System.out.println("Object 1: Number = " + obj1.getNumber() + ", Text = " + obj1.getText());
        System.out.println("Object 2: Number = " + obj2.getNumber() + ", Text = " + obj2.getText());
        System.out.println("Object 3: Number = " + obj3.getNumber() + ", Text = " + obj3.getText());
    }
}


