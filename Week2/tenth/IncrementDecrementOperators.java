package Week2.tenth;

public class IncrementDecrementOperators {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        // Pre-increment
        int preIncrement = ++a; // Increments a first, then assigns to preIncrement
        System.out.println("Pre-increment: " + preIncrement); // 6
        System.out.println("Value of a after pre-increment: " + a); // 6

        // Post-increment
        int postIncrement = b++; // Assigns b to postIncrement, then increments b
        System.out.println("Post-increment: " + postIncrement); // 10
        System.out.println("Value of b after post-increment: " + b); // 11

        // Decrement
        int c = 15;
        int preDecrement = --c; // Decrements c first, then assigns to preDecrement
        System.out.println("Pre-decrement: " + preDecrement); // 14
        System.out.println("Value of c after pre-decrement: " + c); // 14

        int d = 20;
        int postDecrement = d--; // Assigns d to postDecrement, then decrements d
        System.out.println("Post-decrement: " + postDecrement); // 20
        System.out.println("Value of d after post-decrement: " + d); // 19
    }
}
