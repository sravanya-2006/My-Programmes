package practice;

// Superclass ServiceCentre
class ServiceCentre {
    protected String service_name;
    protected double service_cost;

    // Constructor
    public ServiceCentre(String service_name, double service_cost) {
        this.service_name = service_name;
        this.service_cost = service_cost;
    }

    // Method to display service information
    public void infoCentre() {
        System.out.println("Service Name: " + service_name);
        System.out.println("Service Cost: $" + service_cost);
    }
}

// Subclass Complaints inheriting from ServiceCentre
class Complaints extends ServiceCentre {
    private String customer_name;
    private String bike_type;
    private String complaint;

    // Constructor
    public Complaints(String service_name, double service_cost, String customer_name, String bike_type, String complaint) {
        super(service_name, service_cost);
        this.customer_name = customer_name;
        this.bike_type = bike_type;
        this.complaint = complaint;
    }

    // Method to display service needed information
    public void serviceNeeded() {
        System.out.println("Customer Name: " + customer_name);
        System.out.println("Bike Type: " + bike_type);
        System.out.println("Complaint/Service Request: " + complaint);
    }
}

// Subclass Billing inheriting from Complaints
class Billing extends Complaints {
    // Constructor
    public Billing(String service_name, double service_cost, String customer_name, String bike_type, String complaint) {
        super(service_name, service_cost, customer_name, bike_type, complaint);
    }

    // Method to compute bill
    public void computeBill() {
        // Display service information
        infoCentre();
        // Display service needed information
        serviceNeeded();
        // Calculate and display total bill
        double totalBill = service_cost; // Assuming no additional charges for this example
        System.out.println("Total Bill: $" + totalBill);
    }
}

// Main class to test the implementation
public class BikeServiceSystem {
    public static void main(String[] args) {
        // Create objects for Billing
        Billing bill1 = new Billing("Regular Service", 100.0, "John Doe", "Mountain Bike", "Oil Change");
        Billing bill2 = new Billing("Repair", 250.0, "Jane Smith", "Road Bike", "Brake Adjustment");

        // Compute and display bills
        System.out.println("Bill 1:");
        bill1.computeBill();
        System.out.println("\nBill 2:");
        bill2.computeBill();
    }
}
