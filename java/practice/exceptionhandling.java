package practice;
import java.util.InputMismatchException;
import java.util.Scanner;

public class exceptionhandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
        System.out.println("enter the numerator");
        int n = sc.nextInt();

        System.out.println("enter the denominator");
        int d = sc.nextInt();

        System.out.println(n/d);
        }
        catch(ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        catch(InputMismatchException e) {
            System.out.println(e.getMessage());
        }
        
    }
}
