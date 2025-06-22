package practice;

class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public synchronized void decrement() {
        count--;
    }

    public synchronized int getCount() {
        return count;
    }
}

class IncrementThread extends Thread {
    
private Counter counter;

    public IncrementThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 350; i++)
            counter.increment();
    }
}

class DecrementThread extends Thread {
    private Counter counter;

    public DecrementThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 1000; i++)
            counter.decrement();
    }
}

public class SynchronizeAssign {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        IncrementThread increment = new IncrementThread(counter);
        DecrementThread decrement = new DecrementThread(counter);
        increment.start();
        decrement.start();
        increment.join();
        decrement.join();
        System.out.println("Final count:" + counter.getCount());
    }
}
