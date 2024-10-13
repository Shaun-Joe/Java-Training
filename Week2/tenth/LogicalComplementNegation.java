package Week2.tenth;

public class LogicalComplementNegation {
    public static void main(String[] args) {
        boolean condition1 = true;
        boolean condition2 = false;

        // Logical Complement
        System.out.println("Condition1: " + condition1 + " => Negation: " + !condition1); // false
        System.out.println("Condition2: " + condition2 + " => Negation: " + !condition2); // true

        // Combining Logical Operators
        boolean combined = condition1 && condition2; // Logical AND
        System.out.println("Condition1 && Condition2: " + combined); // false
        System.out.println("!(Condition1 && Condition2): " + !combined); // true
    }
}
