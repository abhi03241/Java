package constructor;

public class Customer {
    
    public String customerId;
    public String customerName;
    public long contactNumber;
    public String address;

    // Parameterless constructor
    public Customer() {
        System.out.println("Parameterless constructor called");
    }

    // Parameterized constructor
    public Customer(String customerId, String customerName, long contactNumber, String address) {
        // this() calls the parameterless constructor
        this();
        this.customerId = customerId;
        this.customerName = customerName;
        this.contactNumber = contactNumber;
        this.address = address;
    }

    // Method to display only customer name
    public void displayCustomerName() {
        System.out.println("Customer Name : " + customerName);
    }

    // Method to display all customer details
    public void displayCustomerDetails() {
        System.out.println("Displaying customer details\n***********");
        System.out.println("Customer Id : " + customerId);
        this.displayCustomerName();
        System.out.println("Contact Number : " + contactNumber);
        System.out.println("Address : " + address);
    }
}
