package constructor;

public class Test {
    public static void main(String[] args) {
        Customer customer1 = new Customer("C101", "Alice Johnson", 9876543210L, "12B Baker Street, London");
        customer1.displayCustomerDetails();
    }
}
