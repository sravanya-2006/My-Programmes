package learn;

import java.util.Scanner;

public class switchstatements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 for Hello, 2 for Namaste or 3 for Bonjour:");
        int button = sc.nextInt();

        switch (button) {
            case 1: {
                System.out.println("hello");
                break;
            }
            case 2: {
                System.out.println("Namaste");
                break;
            }
            case 3: {
                System.out.println("bonjour");
                break;
            }
            default: {
                System.out.println("invalid");
            }
        }
        sc.close();
    }
}
