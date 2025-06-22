package practice;

// OnlineLibrary class representing the library system
class OnlineLibrary {
    private int availableBooks = 4; // Initial number of available JAVA books

    // Synchronized method to handle book requests
    public synchronized void bookRequest(String username, int requestedBookCount) {
        // Check if there are enough books to fulfill the request
        if (requestedBookCount <= availableBooks) {
            // Reserve books
            System.out.println(username + " is reserving " + requestedBookCount + " JAVA textbooks.");
            availableBooks -= requestedBookCount;
            System.out.println("Books reserved successfully. Remaining JAVA books: " + availableBooks);
        } else {
            // Not enough books available
            System.out.println("Sorry, " + username + ", there are not enough JAVA textbooks for booking.");
        }
    }
}

// StudentThread class representing each student as a thread
class StudentThread extends Thread {
    private OnlineLibrary library;
    private String username;
    private int requestedBookCount;

    public StudentThread(OnlineLibrary library, String username, int requestedBookCount) {
        this.library = library;
        this.username = username;
        this.requestedBookCount = requestedBookCount;
    }

    @Override
    public void run() {
        // Perform book request
        library.bookRequest(username, requestedBookCount);
    }
}

// Main class to test the OnlineLibrary system
public class LibraryBookingSystem {
    public static void main(String[] args) {
        // Create an instance of OnlineLibrary
        OnlineLibrary library = new OnlineLibrary();

        // Create 4 student threads with different booking requests
        StudentThread student1 = new StudentThread(library, "Student A", 2);
        StudentThread student2 = new StudentThread(library, "Student B", 1);
        StudentThread student3 = new StudentThread(library, "Student C", 3);
        StudentThread student4 = new StudentThread(library, "Student D", 2);

        // Start all threads
        student1.start();
        student2.start();
        student3.start();
        student4.start();

        // Wait for all threads to complete
        try {
            student1.join();
            student2.join();
            student3.join();
            student4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
