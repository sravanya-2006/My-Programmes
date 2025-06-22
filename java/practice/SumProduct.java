package practice;

// Thread to calculate sum of array elements
class SumThread extends Thread {
    private int[] array;
    private int sum;

    public SumThread(int[] array) {
        this.array = array;
        this.sum = 0;
    }

    @Override
    public void run() {
        for (int num : array) {
            sum += num;
        }
    }

    public int getSum() {
        return sum;
    }
}

// Thread to calculate product of array elements
class ProductThread extends Thread {
    private int[] array;
    private long product;

    public ProductThread(int[] array) {
        this.array = array;
        this.product = 1;
    }

    @Override
    public void run() {
        for (int num : array) {
            product *= num;
        }
    }

    public long getProduct() {
        return product;
    }
}

// Main class to coordinate and test the multithreaded application
public class SumProduct {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5}; // Example array of numbers

        // Create and start threads
        SumThread sumThread = new SumThread(numbers);
        ProductThread productThread = new ProductThread(numbers);
        sumThread.start();
        productThread.start();

        try {
            // Wait for threads to complete
            sumThread.join();
            productThread.join();

            // Retrieve results
            int sumResult = sumThread.getSum();
            long productResult = productThread.getProduct();

            // Calculate sum of results
            int totalSum = sumResult + (int) productResult;

            // Display results
            System.out.println("Array elements: " + Arrays.toString(numbers));
            System.out.println("Sum of elements: " + sumResult);
            System.out.println("Product of elements: " + productResult);
            System.out.println("Sum of sum and product: " + totalSum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
