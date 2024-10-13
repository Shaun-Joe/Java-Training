package fourth;

public class KeyDifferences {
    @SuppressWarnings("removal")
    public static void main(String[] args) {
        // Primitive types hold their values directly
        int primitiveA = 10;
        int primitiveB = primitiveA; // Copy of value
        primitiveA = 20; // Changes primitiveA, but not primitiveA
        System.out.println("Primitive A: " + primitiveA); // 20
        System.out.println("Primitive B: " + primitiveB); // 10

        // Reference types hold a reference to the object
        Integer referenceA = new Integer(10);
        Integer referenceB = referenceA; // Reference to the same object
        referenceA = new Integer(20); // Changes referenceA to a new object
        System.out.println("Reference A: " + referenceA); // 20
        System.out.println("Reference B: " + referenceB); // 10 (still refers to original)
    }
}
