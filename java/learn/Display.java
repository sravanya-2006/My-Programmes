package learn;

public class Display {
        public void show(String message) {
            System.out.println(message);
        }
    
        public void show(int number) {
            System.out.println(number);
        }
    
        public static void main(String[] args) {
            Display display = new Display();
            display.show("Hello, world!"); // Calls the first show method
            display.show(42); // Calls the second show method
        }
}



