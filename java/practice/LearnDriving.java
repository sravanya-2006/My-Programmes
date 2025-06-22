package practice;

class Car implements Runnable {
    private String learnerName;

    public Car(String learnerName) {
        this.learnerName = learnerName;
    }

    public synchronized void driveCar() {
        System.out.println("Car is driving by Learner " + learnerName);
        try {
            Thread.sleep(1000); // Simulate driving time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 15; i++) { // Learning duration of 15 days
            driveCar();
        }
    }
}

public class LearnDriving {
    public static void main(String[] args) {
        Car car = new Car("A");

        Thread t1 = new Thread(car);
        Thread t2 = new Thread(new Car("B"));
        Thread t3 = new Thread(new Car("C"));

        t1.start();
        t2.start();
        t3.start();
    }
}
