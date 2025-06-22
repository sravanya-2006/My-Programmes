import java.util.Scanner;

public class PredefinedExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        
        try {
            if (number < 0) {
                throw new IllegalArgumentException("Number must be positive");
            } else {
                System.out.println("Number entered: " + number);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
}


