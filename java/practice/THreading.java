package practice;

class Fibonacci {
    // Method to calculate and print the first 'n' Fibonacci numbers
    public synchronized void fib(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci sequence:");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + a);
            int temp = a;
            a = b;
            b = temp + b;
        }
        System.out.println();
    }
}

class MyThread1 extends Thread {
    private Fibonacci fib;

    public MyThread1(Fibonacci fib) {
        this.fib = fib;
    }

    @Override
    public void run() {
        fib.fib(10); // Print first 10 Fibonacci numbers
    }
}

class MyThread2 extends Thread {
    private Fibonacci fib;

    public MyThread2(Fibonacci fib) {
        this.fib = fib;
    }

    @Override
    public void run() {
        fib.fib(5); // Print first 5 Fibonacci numbers
    }
}

public class THreading {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();

        // Create threads
        MyThread1 thread1 = new MyThread1(fibonacci);
        MyThread2 thread2 = new MyThread2(fibonacci);

        // Start threads
        thread1.start();
        thread2.start();

        // Wait for threads to complete
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Execution of both threads has finished.");
    }
}
