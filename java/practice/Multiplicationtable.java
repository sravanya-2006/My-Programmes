package practice;

// MultiplicationTableThread class to generate multiplication tables
class MultiplicationTableThread extends Thread {
    private int number;

    // Constructor to initialize the number for which table needs to be generated
    public MultiplicationTableThread(int number) {
        this.number = number;
    }

    // Method to generate and print multiplication table for the number
    public void run() {
        System.out.println("Multiplication table for " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
            try {
                Thread.sleep(1000); // Pause for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(); // Empty line for separation
    }
}

// Main class to create and start threads for generating multiplication tables
public class Multiplicationtable {
    public static void main(String[] args) {
        // Create threads for three different numbers
        MultiplicationTableThread thread1 = new MultiplicationTableThread(2);
        MultiplicationTableThread thread2 = new MultiplicationTableThread(5);
        MultiplicationTableThread thread3 = new MultiplicationTableThread(8);

        // Start the threads
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
