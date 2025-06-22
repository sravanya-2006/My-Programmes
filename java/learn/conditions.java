package learn;

import java.util.Scanner;

public class conditions {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        sc.close();

        if (number1 == number2) {
            System.out.println("equal");
        } else if (number1 > number2) {
            System.out.println("greater");
        } else {
            System.out.println("lesser");
        }
    }
}
