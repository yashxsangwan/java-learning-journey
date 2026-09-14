package lessons.oop;

class Product {
    private String itemNumber;
    private String name;
    private double price;
    private short quantity;

    public String getItemNumber() {
        return itemNumber;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public short getQuantity() {
        return quantity;
    }

    public void setPrice(double c) {
        if (c < 0)
            price = 0;
        price = c;
    }

    public void setQuantity(short d) {
        if (d < 0)
            quantity = 0;
        quantity = d;
    }

    public Product() {
        itemNumber = null;
        name = null;
        price = 0;
        quantity = 0;
    }

    public Product(String a, String b) {
        itemNumber = a;
        name = b;
    }

    public Product(String a, String b, double c, short d) {
        itemNumber = a;
        name = b;
        if (c < 0)
            price = 0;
        else
            price = c;
        if (d < 0)
            quantity = 0;
        else
            quantity = d;
    }

}

class Customer {
    private String customerId;
    private String name;
    private String address;
    private String phoneNumber;

    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Customer() {
        customerId = null;
        name = null;
        address = null;
        phoneNumber = null;
    }
    public Customer(String id) {
        customerId = id;
    }
    public Customer(String id, String n) {
        customerId = id;
        name = n;
    }
    public Customer(String id, String a, String b, String c) {
        customerId = id;
        name = a;
        address = b;
        phoneNumber = c;
    }

}

public class ProductTest {
    public static void main(String[] args) {

        // Product obj1 = new Product();
        Product obj1 = new Product("A20-26", "brush", 2.99, (short) 10);

        System.out.println("Product Number: " + obj1.getItemNumber());
        System.out.println("Product Name: " + obj1.getName());
        System.out.println("Product Price: " + obj1.getPrice());
        System.out.println("Product Quantity: " + obj1.getQuantity());

        System.out.println();

        // Customer obj2 = new Customer();
        Customer obj2 = new Customer("id@0081", "Yash", "Delhi", "9000500010");

        System.out.println("Customer Id: " + obj2.getCustomerId());
        System.out.println("Customer Name: " + obj2.getName());
        System.out.println("Customer Address: " + obj2.getAddress());
        System.out.println("Customer Phone Number: " + obj2.getPhoneNumber());

    }
}

