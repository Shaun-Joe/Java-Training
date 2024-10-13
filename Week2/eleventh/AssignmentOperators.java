package Week2.eleventh;

public class AssignmentOperators {
    public static void main(String[] args) {
        int x = 10; // Simple assignment
        System.out.println("Initial value of x: " + x);

        // Using simple assignment
        int y = x; // Assign x to y
        System.out.println("Value of y: " + y); // 10

        // Using addition assignment
        x += 5; // Equivalent to x = x + 5
        System.out.println("After x += 5, x: " + x); // 15

        // Using Subtraction assignment
        x -= 3; // Equivalent to x = x - 3
        System.out.println("After x -= 3, x: " + x); // 12

        // Using multiplication assignment
        x *= 2; // Equivalent to x = x * 2
        System.out.println("After x *= 2, x: " + x); // 24

        // Using division assignment
        x /= 4; // Equivalent to x = x / 4
        System.out.println("After x /= 4, x: " + x); // 6

        // Using modular assignment
        x %= 5; // Equivalent to x = x % 5
        System.out.println("After x %= 5, x: " + x); // 1
    }
}
