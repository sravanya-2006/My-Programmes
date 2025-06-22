package practice;

// Custom exception for invalid money amount (negative)
class InvalidMoneyException extends Exception {
    public InvalidMoneyException(String message) {
        super(message);
    }
}

// Custom exception for insufficient balance
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

// Bank class
class Bank {
    private double balance;

    public Bank(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) throws InvalidMoneyException {
        if (amount < 0) {
            throw new InvalidMoneyException("Invalid deposit amount: " + amount);
        }
        balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("Current Balance: " + balance);
    }

    public void withdraw(double amount) throws InvalidMoneyException, InsufficientBalanceException {
        if (amount < 0) {
            throw new InvalidMoneyException("Invalid withdrawal amount: " + amount);
        }
        if (balance < amount) {
            throw new InsufficientBalanceException("Insufficient balance: " + balance);
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
        System.out.println("Current Balance: " + balance);
    }
}

public class BankExample {
    public static void main(String[] args) {
        Bank account = new Bank(1000);

        try {
            account.deposit(500);
            account.withdraw(200);
            account.withdraw(1500); // This should throw InsufficientBalanceException
            account.deposit(-100); // This should throw InvalidMoneyException
        } catch (InvalidMoneyException | InsufficientBalanceException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}

