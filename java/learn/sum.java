package learn;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int number1 = sc.nextInt();
        System.out.println("Enter the second number:");
        int number2 = sc.nextInt();
        sc.close();

        int sum = number1 + number2;
        int diff = number1 - number2;

        System.out.println("The sum of the numbers is: " + sum);
        System.out.println("The difference between the numbers is: " + diff);
    }
}

