package practice;

// VITUniversity class implementing Runnable interface
class VITUniversity implements Runnable {

    // Array of department names
    private String[] departments = {"Computer Science", "Electronics", "Mechanical", "Civil", "Chemical"};

    @Override
    public void run() {
        try {
            // Sleep for 10 seconds
            Thread.sleep(10000);
            
            // Print department names with thread ID and name
            for (String department : departments) {
                System.out.println(department + " - Thread ID: " + Thread.currentThread().threadId() + ", Name: " + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Department {
    public static void main(String[] args) {
        // Create instance of VITUniversity
        VITUniversity vitUniversity = new VITUniversity();

        // Create three threads
        Thread vit1 = new Thread(vitUniversity, "vit1");
        Thread vit2 = new Thread(vitUniversity, "vit2");
        Thread vit3 = new Thread(vitUniversity, "vit3");

        // Start threads
        vit1.start();
        vit2.start();
        vit3.start();

        // Main thread waits for all child threads to finish
        try {
            vit1.join();
            vit2.join();
            vit3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Execution completes after all threads finish
        System.out.println("Execution is over.");
    }
}
