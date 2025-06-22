package lab;

// CabinRental class
public class CabinRental {
    private int cabinNumber;
    private double weeklyRentalRate;

    public CabinRental(int cabinNumber) {
        this.cabinNumber = cabinNumber;
        if (cabinNumber <= 3) {
            weeklyRentalRate = 950;
        } else {
            weeklyRentalRate = 1100;
        }
    }

    public int getCabinNumber() {
        return cabinNumber;
    }

    public double getWeeklyRentalRate() {
        return weeklyRentalRate;
    }
}

// HolidayCabinRental class
public class HolidayCabinRental extends CabinRental {
    public HolidayCabinRental(int cabinNumber) {
        super(cabinNumber);
        weeklyRentalRate += 150;
    }
}

// DemoCabinRental class
public class DemoCabinRental {
    public static void main(String[] args) {
        CabinRental cabinRental = new CabinRental(2);
        System.out.println("Cabin Number: " + cabinRental.getCabinNumber());
        System.out.println("Weekly Rental Rate: " + cabinRental.getWeeklyRentalRate());

        HolidayCabinRental holidayCabinRental = new HolidayCabinRental(4);
        System.out.println("Cabin Number: " + holidayCabinRental.getCabinNumber());
        System.out.println("Weekly Rental Rate: " + holidayCabinRental.getWeeklyRentalRate());
    }
}
