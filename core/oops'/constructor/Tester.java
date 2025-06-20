package constructor;

class Customer { 
    public String customerId; 
    public String customerName; 
    public long contactNumber; 
    public String address; 

    // Parameterized constructor
    public Customer(String cId, String cName, String add, long contact) { 
        System.out.println("Parameterized constructor called"); 
        customerId = cId; 
        customerName = cName; 
        contactNumber = contact; 
        address = add; 
    }

    // Optional: Default constructor (uncomment if you want to use it)
    
    public Customer() {
        System.out.println("Parameterless constructor called");
    }
    
} 

class Tester {
    public static void main(String args[]) { 
        // This line will give an error if default constructor is not present
        // So either comment it or define the default constructor
        // Customer customer2 = new Customer();

        // Correct usage of the parameterized constructor
        Customer customer1 = new Customer("C103", "Jacob", "13th Street, New York", 5648394590L); 
        System.out.println("Customer ID: " + customer1.customerId);
        System.out.println("Customer Name: " + customer1.customerName);
        System.out.println("Address: " + customer1.address);
        System.out.println("Contact Number: " + customer1.contactNumber);

        
    } 
}

