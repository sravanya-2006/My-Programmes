package practice;

class Fibonacci {
    private int a = 0, b = 1;

    public synchronized int nextFibonacci() {
        int next = a;
        a = b;
        b = next + b;
        return next;
    }
}

class FatherThread extends Thread {
    private Fibonacci fibonacci;

    public FatherThread(Fibonacci fibonacci) {
        this.fibonacci = fibonacci;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Father Thread Fibonacci: " + fibonacci.nextFibonacci());
        }
    }
}

class MotherThread extends Thread {
    private Fibonacci fibonacci;

    public MotherThread(Fibonacci fibonacci) {
        this.fibonacci = fibonacci;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Mother Thread Fibonacci: " + fibonacci.nextFibonacci());
        }
    }
}

public class FatherMother {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();

        FatherThread fatherThread = new FatherThread(fibonacci);
        MotherThread motherThread = new MotherThread(fibonacci);

        fatherThread.start();
        motherThread.start();

        try {
            fatherThread.join();
            motherThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

