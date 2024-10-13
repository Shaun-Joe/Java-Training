package third;

class House {
    private String address;

    // Instance initializer block
    {
        address = "123 Main St";
        System.out.println("Instance initializer block: Address set to " + address);
    }

    // Constructor
    public House() {
        System.out.println("Constructor: House created at " + address);
    }
}

public class OrderOfInitializationExample {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        House house = new House();
    }
}
