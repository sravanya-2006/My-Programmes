package practice;

// PaymentGateway interface
interface PaymentGateway {
    void processPayment(CreditCard creditCard, double transactionAmount);
    void refundPayment(CreditCard creditCard, double transactionAmount);
}

// CreditCard class
class CreditCard {
    private double limit;

    public CreditCard(double limit) {
        this.limit = limit;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }
}

// Concrete Payment Gateway Implementations

class CCAvenue implements PaymentGateway {
    @Override
    public void processPayment(CreditCard creditCard, double transactionAmount) {
        if (transactionAmount <= creditCard.getLimit()) {
            System.out.println("Payment processed successfully via CCAvenue.");
            creditCard.setLimit(creditCard.getLimit() - transactionAmount);
        } else {
            System.out.println("Transaction amount exceeds credit card limit for CCAvenue.");
        }
    }

    @Override
    public void refundPayment(CreditCard creditCard, double transactionAmount) {
        System.out.println("Refund processed successfully via CCAvenue.");
        creditCard.setLimit(creditCard.getLimit() + transactionAmount);
    }
}

class PayUBiz implements PaymentGateway {
    @Override
    public void processPayment(CreditCard creditCard, double transactionAmount) {
        if (transactionAmount <= creditCard.getLimit()) {
            System.out.println("Payment processed successfully via PayUBiz.");
            creditCard.setLimit(creditCard.getLimit() - transactionAmount);
        } else {
            System.out.println("Transaction amount exceeds credit card limit for PayUBiz.");
        }
    }

    @Override
    public void refundPayment(CreditCard creditCard, double transactionAmount) {
        System.out.println("Refund processed successfully via PayUBiz.");
        creditCard.setLimit(creditCard.getLimit() + transactionAmount);
    }
}

// Similarly implement classes for BillDesk, ePaisa, Direcpay ...

// Driver class to demonstrate dynamic method dispatch
public class PaymentIntegration {
    public static void main(String[] args) {
        // Example usage
        CreditCard creditCard = new CreditCard(5000); // Credit card with limit $5000

        PaymentGateway gateway1 = new CCAvenue();
        PaymentGateway gateway2 = new PayUBiz();

        // Process payments
        gateway1.processPayment(creditCard, 3000); // Using CCAvenue
        gateway2.processPayment(creditCard, 2000); // Using PayUBiz

        // Refund payments
        gateway1.refundPayment(creditCard, 1000); // Using CCAvenue
        gateway2.refundPayment(creditCard, 500); // Using PayUBiz

        // Print remaining credit card limit
        System.out.println("Remaining Credit Card Limit: $" + creditCard.getLimit());
    }
}
