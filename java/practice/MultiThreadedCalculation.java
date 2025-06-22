package practice;

public class MultiThreadedCalculation {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5}; // Example array

        SumThread sumThread = new SumThread(numbers);
        ProductThread productThread = new ProductThread(numbers);

        sumThread.start();
        productThread.start();

        try {
            sumThread.join();
            productThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int sumResult = sumThread.getSumResult();
        int productResult = productThread.getProductResult();

        int finalResult = sumResult + productResult;

        System.out.println("Sum of numbers: " + sumResult);
        System.out.println("Product of numbers: " + productResult);
        System.out.println("Sum of sum and product: " + finalResult);
    }
}

class SumThread extends Thread {
    private int[] numbers;
    private int sumResult;

    public SumThread(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {
        sumResult = 0;
        for (int number : numbers) {
            sumResult += number;
        }
    }

    public int getSumResult() {
        return sumResult;
    }
}

class ProductThread extends Thread {
    private int[] numbers;
    private int productResult;

    public ProductThread(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {
        productResult = 1;
        for (int number : numbers) {
            productResult *= number;
        }
    }

    public int getProductResult() {
        return productResult;
    }
}

