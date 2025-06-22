package practice;

public class AnonymousThreadExample {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Thread A - Count: " + i);
                    try {
                        Thread.sleep(400);
                    } catch (InterruptedException e) {
                        System.out.println("Thread A interrupted.");
                    }
                }
                System.out.println("Thread A completed.");
            }
        });


        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Thread B - Count: " + i);
                    try {
                        // Sleep for 600 milliseconds
                        Thread.sleep(600);
                    } catch (InterruptedException e) {
                        System.out.println("Thread B interrupted.");
                    }
                }
                System.out.println("Thread B completed.");
            }
        });

        thread1.start();
        thread2.start();
    }
}

