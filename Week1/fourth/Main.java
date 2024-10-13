package fourth;

/**
 * Distinguishing Between Object References and Primitives
 */
public class Main {
    @SuppressWarnings("removal")
    public static void main(String[] args) {
        // Primitive Type
        int primitiveInt = 42;
        System.out.println("Primitive int: " + primitiveInt);

        // Reference type
        Integer referenceInt = new Integer(primitiveInt); // Boxing

        // Modifying values
        primitiveInt = 100;
        referenceInt = 200; // This doesn't affect the original object

        System.out.println("Modified Primitive int: " + primitiveInt);
        System.out.println("Modified Reference Integer: " + referenceInt);
    }
}