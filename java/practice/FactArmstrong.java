package practice;

// ThreadNumber class with synchronized methods for factorial and Armstrong number check
class ThreadNumber {
    
    // Method to calculate factorial
    public synchronized void factorial(int n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + n + ": " + factorial);
    }
    
    // Method to check Armstrong number
    public synchronized void checkArmstrong(int n) {
        int originalNumber = n;
        int digits = 0;
        int result = 0;
        
        // Count number of digits
        while (originalNumber != 0) {
            originalNumber /= 10;
            digits++;
        }
        
        originalNumber = n;
        
        // Calculate Armstrong number
        while (originalNumber != 0) {
            int remainder = originalNumber % 10;
            result += Math.pow(remainder, digits);
            originalNumber /= 10;
        }
        
        if (result == n) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }
    }
}

// MyThread1 class to calculate factorial
class MyThread1 extends Thread {
    private ThreadNumber threadNumber;
    
    public MyThread1(ThreadNumber threadNumber) {
        this.threadNumber = threadNumber;
    }
    
    @Override
    public void run() {
        threadNumber.factorial(10);
    }
}

// MyThread2 class to check Armstrong number
class MyThread2 extends Thread {
    private ThreadNumber threadNumber;
    private int number;
    
    public MyThread2(ThreadNumber threadNumber, int number) {
        this.threadNumber = threadNumber;
        this.number = number;
    }
    
    @Override
    public void run() {
        threadNumber.checkArmstrong(number);
    }
}

// Main class to create threads and test
public class FactArmstrong{
    public static void main(String[] args) throws InterruptedException {
        ThreadNumber threadNumber = new ThreadNumber();
        
        // Create threads
        MyThread1 thread1 = new MyThread1(threadNumber);
        MyThread2 thread2 = new MyThread2(threadNumber, 123);
        
        // Start threads
        thread1.start();
        thread2.start();
        
        // Wait for threads to finish
        thread1.join();
        thread2.join();
        
        System.out.println("All threads completed.");
    }
}
