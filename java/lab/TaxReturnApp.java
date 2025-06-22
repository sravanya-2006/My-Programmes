package lab;

import java.util.Scanner;

class TaxReturn {
    private String socialSecurityNumber;
    private String lastName;
    private String firstName;
    private String streetAddress;
    private String city;
    private String state;
    private String zipCode;
    private double annualIncome;
    private char maritalStatus;
    private double taxLiability;

    public TaxReturn(String socialSecurityNumber, String lastName, String firstName, String streetAddress, String city, String state, String zipCode, double annualIncome, char maritalStatus) {
        this.socialSecurityNumber = socialSecurityNumber;
        this.lastName = lastName;
        this.firstName = firstName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.annualIncome = annualIncome;
        this.maritalStatus = maritalStatus;

        calculateTaxLiability();
    }

    private void calculateTaxLiability() {
        if (annualIncome <= 20000) {
            taxLiability = annualIncome * (maritalStatus == 'S' || maritalStatus == ''? 0.15 : 0.20);
        } else if (annualIncome <= 50000) {
            taxLiability = annualIncome * (maritalStatus == 'S' || maritalStatus == ''? 0.14 : 0.30);
        } else {
            taxLiability = annualIncome * (maritalStatus == 'S' || maritalStatus == ''? 0.22 : 0.28);
        }
    }

    public void display() {
        System.out.println("Tax Return Information:");
        System.out.println("Social Security Number: " + socialSecurityNumber);
        System.out.println("Last Name: " + lastName);
        System.out.println("First Name: " + firstName);
        System.out.println("Street Address: " + streetAddress);
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("Zip Code: " + zipCode);
        System.out.println("Annual Income: " + annualIncome);
        System.out.println("Marital Status: " + (maritalStatus == 'S' || maritalStatus == ''? "Single" : "Married"));
        System.out.println("Tax Liability: " + taxLiability);
    }
}

public class TaxReturnApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String socialSecurityNumber, lastName, firstName, streetAddress, city, state, zipCode;
        double annualIncome;
        char maritalStatus;

        while (true) {
            System.out.print("Enter Social Security Number (XXX-XX-XXXX): ");
            socialSecurityNumber = scanner.next();
            if (isValidSocialSecurityNumber(socialSecurityNumber)) break;
            System.out.println("Invalid Social Security Number. Please try again.");

            System.out.print("Enter Last Name: ");
            lastName = scanner.next();

            System.out.print("Enter First Name: ");
            firstName = scanner.next();

            System.out.print("Enter Street Address: ");
            streetAddress = scanner.next();

            System.out.print("Enter City: ");
            city = scanner.next();

            System.out.print("Enter State: ");
            state = scanner.next();

            System.out.print("Enter Zip Code (XXXXX): ");
            zipCode = scanner.next();
            if (isValidZipCode(zipCode)) break;
            System.out.println("Invalid Zip Code. Please try again.");

            System.out.print("Enter Annual Income: ");
            annualIncome = scanner.nextDouble();
            if (annualIncome >= 0) break;
            System.out.println("Invalid Annual Income. Please try again.");

            System.out.print("Enter Marital Status (S/M): ");
            maritalStatus = scanner.next().charAt(0);
            if (isValidMaritalStatus(maritalStatus)) break;
            System.out.println("Invalid Marital Status. Please try again.");
        }

        TaxReturn taxReturn = new TaxReturn(socialSecurityNumber, lastName, firstName, streetAddress, city, state, zipCode, annualIncome, maritalStatus);
        taxReturn.display();
    }

    private static boolean isValidSocialSecurityNumber(String socialSecurityNumber) {
        return socialSecurityNumber.matches("\\d{3}-\\d{2}-\\d{4}");
    }

    private static boolean isValidZipCode(String zipCode) {
        return zipCode.matches("\\d{5}");
    }

    private static boolean isValidMaritalStatus(char maritalStatus) {
        return maritalStatus == 'S' || maritalStatus == '' || maritalStatus == 'M' || maritalStatus == '';
    }
}
