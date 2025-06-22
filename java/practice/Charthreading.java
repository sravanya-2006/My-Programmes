package practice;

class MyApplication implements Runnable {
    private String threadName;

    public MyApplication(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.println(threadName + ": " + ch + " (Thread ID: " + Thread.currentThread().threadId() + ")");
            try {
                Thread.sleep(5000); // Sleep for 5 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Charthreading {
    public static void main(String[] args) {
        // Create threads
        Thread my_t1 = new Thread(new MyApplication("my_t1"));
        Thread my_t2 = new Thread(new MyApplication("my_t2"));
        Thread my_t3 = new Thread(new MyApplication("my_t3"));

        // Start threads
        my_t1.start();
        my_t2.start();
        my_t3.start();

        // Wait for threads to complete
        try {
            my_t1.join();
            my_t2.join();
            my_t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All work completed.");
    }
}

