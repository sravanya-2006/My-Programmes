import java.util.*;

class MyRunnable implements Runnable {
    private String threadName;
    
    public MyRunnable(String threadName) {
        this.threadName = threadName;
    }

    public void run() {
        System.out.println("Thread " + threadName + " is running.");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted.");
        }
        System.out.println("Thread " + threadName + " exiting.");
    }
}

public class Threadexample {
    public static void main(String[] args) {
        System.out.println("Main thread is starting.");

        MyRunnable myRunnable1 = new MyRunnable("Thread-1");
        MyRunnable myRunnable2 = new MyRunnable("Thread-2");

        Thread thread1 = new Thread(myRunnable1);
        Thread thread2 = new Thread(myRunnable2);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Main thread exiting.");
    }
}
