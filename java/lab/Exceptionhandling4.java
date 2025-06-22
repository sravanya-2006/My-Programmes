package lab;

// RentHouseException class (user-defined exception)
class RentHouseException extends Exception {
    public RentHouseException(String message) {
        super(message);
    }
}

// RentHouse class
class RentHouse {
    private int bedrooms;
    private double rent;

    public RentHouse(int bedrooms, double rent) throws RentHouseException {
        if (bedrooms < 1 || bedrooms > 4) {
            throw new RentHouseException("Invalid number of bedrooms. It should be between 1 and 4.");
        }
        if (rent < 5000 || rent > 25000) {
            throw new RentHouseException("Invalid rent. It should be between Rs. 5000 and Rs. 25000.");
        }
        this.bedrooms = bedrooms;
        this.rent = rent;
    }

    public String toString() {
        return "Bedrooms: " + bedrooms + ", Rent: Rs. " + rent;
    }
}

// TestRentHouse class
public class Exceptionhandling4 {
    public static void main(String[] args) {
        try {
            RentHouse house1 = new RentHouse(2, 8000);
            System.out.println("House 1 created successfully: " + house1.toString());
        } catch (RentHouseException e) {
            System.out.println("Error creating House 1: " + e.getMessage());
        }

        try {
            RentHouse house2 = new RentHouse(5, 10000);
            System.out.println("House 2 created successfully: " + house2.toString());
        } catch (RentHouseException e) {
            System.out.println("Error creating House 2: " + e.getMessage());
        }

        try {
            RentHouse house3 = new RentHouse(3, 3000);
            System.out.println("House 3 created successfully: " + house3.toString());
        } catch (RentHouseException e) {
            System.out.println("Error creating House 3: " + e.getMessage());
        }

        try {
            RentHouse house4 = new RentHouse(1, 40000);
            System.out.println("House 4 created successfully: " + house4.toString());
        } catch (RentHouseException e) {
            System.out.println("Error creating House 4: " + e.getMessage());
        }
    }
}