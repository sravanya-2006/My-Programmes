package practice;

class SalesTrack {
    private int numberOfItemsSold;
    private double totalSales;
    private double totalDiscount;
    private double costPerItem;
    private int bulkQuantity;
    private double bulkDiscountPercentage;

    // Constructor
    public SalesTrack(double costPerItem, int bulkQuantity, double bulkDiscountPercentage) {
        this.costPerItem = costPerItem;
        this.bulkQuantity = bulkQuantity;
        this.bulkDiscountPercentage = bulkDiscountPercentage;
        this.numberOfItemsSold = 0;
        this.totalSales = 0;
        this.totalDiscount = 0;
    }

    // Method to register sale of n items
    public void registerSale(int n) {
        double discount = 0;
        double salePrice = costPerItem;

        // Apply bulk discount if n is greater than or equal to bulkQuantity
        if (n >= bulkQuantity) {
            discount = costPerItem * bulkDiscountPercentage / 100;
            salePrice = costPerItem - discount;
        }

        // Update sales tracking variables
        numberOfItemsSold += n;
        totalSales += salePrice * n;
        totalDiscount += discount * n;
    }

    // Method to display sales information
    public void displaySales() {
        System.out.println("Number of Items Sold: " + numberOfItemsSold);
        System.out.println("Total Sales: $" + totalSales);
        System.out.println("Total Discounts: $" + totalDiscount);
    }

    public static void main(String[] args) {
        // Create a SalesTrack object
        SalesTrack salesTrack = new SalesTrack(50.0, 10, 20.0);

        // Register sales
        salesTrack.registerSale(5);  // Less than bulk quantity
        salesTrack.registerSale(10); // Exactly bulk quantity
        salesTrack.registerSale(20); // Greater than bulk quantity

        // Display sales information
        salesTrack.displaySales();
    }
}

