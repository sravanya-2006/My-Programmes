package lab;


// ProductException class
class ProductException extends Exception {
    public ProductException(String message) {
        super(message);
    }
}

// Product class
class Product {
    private String productNum;
    private double price;

    public Product(String productNum, double price) throws ProductException {
        if (!isValidProductNum(productNum)) {
            throw new ProductException("Invalid product number: " + productNum);
        }
        if (!isValidPrice(price)) {
            throw new ProductException("Invalid price: " + price);
        }
        this.productNum = productNum;
        this.price = price;
    }

    private boolean isValidProductNum(String productNum) {
        return productNum.matches("\\d{3}");
    }

    private boolean isValidPrice(double price) {
        return price >= 50.01 && price <= 1000.0;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productNum='" + productNum + '\'' +
                ", price=" + price +
                '}';
    }
}

// Application class
public class Exceptionhandling2 {
    public static void main(String[] args) {
        try {
            Product product1 = new Product("123", 75.0);
            System.out.println("Product created successfully: " + product1);

            Product product2 = new Product("abc", 100.0);
            // This should throw a ProductException

            Product product3 = new Product("456", 25.0);
            // This should throw a ProductException

            Product product4 = new Product("789", 1500.0);
            // This should throw a ProductException

            Product product5 = new Product("901", 500.0);
            System.out.println("Product created successfully: " + product5);
        } catch (ProductException e) {
            System.out.println("Error creating product: " + e.getMessage());
        }
    }
}
