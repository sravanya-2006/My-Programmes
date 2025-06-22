package practice;

// Generic Matrix class
class GenericMatrix<T extends Number> {
    private T[][] data;
    private int rows;
    private int cols;

    // Constructor
    public GenericMatrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.data = (T[][]) new Number[rows][cols]; // Create generic array
    }

    // Method to get element at specific position
    public T get(int row, int col) {
        return data[row][col];
    }

    // Method to set element at specific position
    public void set(int row, int col, T value) {
        data[row][col] = value;
    }

    // Method to perform matrix addition
    public GenericMatrix<T> add(GenericMatrix<T> other) {
        if (rows != other.rows || cols != other.cols) {
            throw new IllegalArgumentException("Matrix dimensions must be the same for addition.");
        }
        
        GenericMatrix<T> result = new GenericMatrix<>(rows, cols);
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Perform addition element-wise
                result.set(i, j, addElements(get(i, j), other.get(i, j)));
            }
        }
        
        return result;
    }

    // Method to perform matrix subtraction
    public GenericMatrix<T> subtract(GenericMatrix<T> other) {
        if (rows != other.rows || cols != other.cols) {
            throw new IllegalArgumentException("Matrix dimensions must be the same for subtraction.");
        }
        
        GenericMatrix<T> result = new GenericMatrix<>(rows, cols);
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Perform subtraction element-wise
                result.set(i, j, subtractElements(get(i, j), other.get(i, j)));
            }
        }
        
        return result;
    }

    // Helper method to add elements
    private T addElements(T a, T b) {
        return (T) ((Number) a).doubleValue() + ((Number) b).doubleValue();
    }

    // Helper method to subtract elements
    private T subtractElements(T a, T b) {
        return (T) ((Number) a).doubleValue() - ((Number) b).doubleValue();
    }

    // Method to display the matrix
    public void display() {
        for (T[] row : data) {
            System.out.println(Arrays.toString(row));
        }
    }
}

// Main class to test GenericMatrix operations
public class GenricMatrix {
    public static void main(String[] args) {
        // Testing Integer matrix
        GenericMatrix<Integer> intMatrix1 = new GenericMatrix<>(2, 2);
        intMatrix1.set(0, 0, 1);
        intMatrix1.set(0, 1, 2);
        intMatrix1.set(1, 0, 3);
        intMatrix1.set(1, 1, 4);
        
        GenericMatrix<Integer> intMatrix2 = new GenericMatrix<>(2, 2);
        intMatrix2.set(0, 0, 5);
        intMatrix2.set(0, 1, 6);
        intMatrix2.set(1, 0, 7);
        intMatrix2.set(1, 1, 8);
        
        System.out.println("Integer Matrix 1:");
        intMatrix1.display();
        System.out.println("Integer Matrix 2:");
        intMatrix2.display();
        
        // Test addition
        System.out.println("Addition Result:");
        GenericMatrix<Integer> intAddResult = intMatrix1.add(intMatrix2);
        intAddResult.display();
        
        // Test subtraction
        System.out.println("Subtraction Result:");
        GenericMatrix<Integer> intSubtractResult = intMatrix1.subtract(intMatrix2);
        intSubtractResult.display();
        
        System.out.println();
        
        // Testing Float matrix
        GenericMatrix<Float> floatMatrix1 = new GenericMatrix<>(2, 2);
        floatMatrix1.set(0, 0, 1.1f);
        floatMatrix1.set(0, 1, 2.2f);
        floatMatrix1.set(1, 0, 3.3f);
        floatMatrix1.set(1, 1, 4.4f);
        
        GenericMatrix<Float> floatMatrix2 = new GenericMatrix<>(2, 2);
        floatMatrix2.set(0, 0, 5.5f);
        floatMatrix2.set(0, 1, 6.6f);
        floatMatrix2.set(1, 0, 7.7f);
        floatMatrix2.set(1, 1, 8.8f);
        
        System.out.println("Float Matrix 1:");
        floatMatrix1.display();
        System.out.println("Float Matrix 2:");
        floatMatrix2.display();
        
        // Test addition
        System.out.println("Addition Result:");
        GenericMatrix<Float> floatAddResult = floatMatrix1.add(floatMatrix2);
        floatAddResult.display();
        
        // Test subtraction
        System.out.println("Subtraction Result:");
        GenericMatrix<Float> floatSubtractResult = floatMatrix1.subtract(floatMatrix2);
        floatSubtractResult.display();
    }
}
