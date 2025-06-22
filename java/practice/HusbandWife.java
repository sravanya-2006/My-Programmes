package practice;

// BankAccount class representing the shared bank account
class BankAccount {
    private int balance;

    public BankAccount(int initialBalance) {
        this.balance = initialBalance;
    }

    // Method to deposit money into the account
    public synchronized void deposit(int amount) {
        System.out.println(Thread.currentThread().getName() + " is depositing " + amount + " units.");
        balance += amount;
        System.out.println("Current Balance after deposit by " + Thread.currentThread().getName() + ": " + balance);
        notify();  // Notify waiting threads that balance has been updated
    }

    // Method to withdraw money from the account
    public synchronized void withdraw(int amount) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " is withdrawing " + amount + " units.");
        while (balance < amount) {
            System.out.println("Insufficient balance for " + Thread.currentThread().getName() + ". Waiting...");
            wait();  // Wait until balance is sufficient
        }
        balance -= amount;
        System.out.println("Current Balance after withdrawal by " + Thread.currentThread().getName() + ": " + balance);
    }
}

// Husband thread representing the husband who withdraws money
class Husband extends Thread {
    private BankAccount account;

    public Husband(BankAccount account) {
        this.account = account;
    }

    public void run() {
        try {
            account.withdraw(200); // Husband tries to withdraw 200 units
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

// Wife thread representing the wife who deposits money
class Wife extends Thread {
    private BankAccount account;

    public Wife(BankAccount account) {
        this.account = account;
    }

    public void run() {
        account.deposit(300); // Wife deposits 300 units
    }
}

// Main class to execute the program
public class HusbandWife {
    public static void main(String[] args) {
        BankAccount jointAccount = new BankAccount(500); // Initial balance 500 units

        Husband husband = new Husband(jointAccount);
        Wife wife = new Wife(jointAccount);

        husband.start();
        wife.start();
    }
}

