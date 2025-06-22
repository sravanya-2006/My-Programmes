package practice;

// Interface Discount
interface Discount {
    double calDiscount(int quantity, double item_price);
}

// Class Wholesale implementing Discount interface
class Wholesale implements Discount {
    private int min_items;
    private double percentage;

    // Constructor
    public Wholesale(int min_items, double percentage) {
        this.min_items = min_items;
        this.percentage = percentage;
    }

    // Override method calDiscount to calculate discount based on quantity and item_price
    @Override
    public double calDiscount(int quantity, double item_price) {
        double total_cost = quantity * item_price;
        if (quantity > min_items) {
            return percentage / 100.0 * total_cost; // Calculate discount percentage
        } else {
            return 0; // No discount
        }
    }

    // Method to calculate total cost without discount
    public double totalCost(int quantity, double item_price) {
        return quantity * item_price;
    }

    // Method to calculate total amount spent after applying discount
    public double totalSpent(int quantity, double item_price) {
        double total_cost = totalCost(quantity, item_price);
        double discount = calDiscount(quantity, item_price);
        return total_cost - discount;
    }
}

// Driver class TotalDiscount
public class TotalDiscount {
    public static void main(String[] args) {
        int quantity = 10;       // Example: Number of items purchased
        double item_price = 100; // Example: Price per item
        
        // Create an instance of Wholesale with min_items = 5 and percentage = 20%
        Wholesale wholesale = new Wholesale(5, 20);

        // Calculate and display the total cost without discount
        double total_cost = wholesale.totalCost(quantity, item_price);
        System.out.println("Total Cost without Discount: $" + total_cost);

        // Calculate and display the total spent after applying discount
        double total_spent = wholesale.totalSpent(quantity, item_price);
        System.out.println("Total Spent after Discount: $" + total_spent);
    }
}

