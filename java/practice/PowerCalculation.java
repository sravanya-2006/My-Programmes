package practice;

class Power {
    public void calculatePower(int x, int n) {
        synchronized (this) {
            int result = 1;
            for (int i = 0; i < n; i++) {
                result *= x;
            }
            System.out.println("Power of " + x + " to the " + n + " is: " + result);
        }
    }
}

public class PowerCalculation {

    public static void main(String[] args) {
        Power power = new Power();

        // Thread T1 to calculate power of (5, 4)
        Thread T1 = new Thread(new Runnable() {
            @Override
            public void run() {
                power.calculatePower(5, 4);
            }
        });

        // Thread T2 to calculate power of (6, 3)
        Thread T2 = new Thread(new Runnable() {
            @Override
            public void run() {
                power.calculatePower(6, 3);
            }
        });

        // Start both threads
        T1.start();
        T2.start();
    }
}
