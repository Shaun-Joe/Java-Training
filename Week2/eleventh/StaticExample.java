package Week2.eleventh;

public class StaticExample {
    static int staticVariable = 10; // A static variable

    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        System.out.println("Initial static variable: " + StaticExample.staticVariable);

        // Creating an instance of the class
        StaticExample obj = new StaticExample();

        // Setting static variable through the instance
        obj.staticVariable = 20;

        // Accessing static variable again
        System.out.println("Static variable after modification: " + StaticExample.staticVariable);

        // Nullifying the instance reference
        obj = null;

        // Triggering garbage collection (optional, not guaranteed to run immediately)
        System.gc();

        // Accessing static variable after garbage collection
        System.out.println("Static variable after garbage collection: " + StaticExample.staticVariable);
    }
}
