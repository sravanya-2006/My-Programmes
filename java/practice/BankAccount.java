import java.util.Scanner;

public class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount();

        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();

        scanner.nextLine(); 

        System.out.print("Enter account holder's name: ");
        String accountHolderName = scanner.nextLine();

        System.out.print("Enter initial balance: ");
        double balance = scanner.nextDouble();

        account.setAccountNumber(accountNumber);
        account.setAccountHolderName(accountHolderName);
        account.setBalance(balance);

        System.out.println("\nAccount details:");
        System.out.println("Account number: " + account.getAccountNumber());
        System.out.println("Account holder's name: " + account.getAccountHolderName());
        System.out.println("Balance: " + account.getBalance());

        scanner.close();
    }
}

