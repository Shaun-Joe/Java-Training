package Week2.eleventh;

public class CompoundAssignmentOperators {
    public static void main(String[] args) {
        int num = 10;

        // Compound addition
        num += 5; // Equivalent to num = num + 5
        System.out.println("After num += 5: " + num); // 15

        // Compound subtraction
        num -= 3; // Equivalent to num = num - 3
        System.out.println("After num -= 3: " + num); // 12

        // Compound multiplication
        num *= 2; // Equivalent to num = num * 2
        System.out.println("After num *= 2: " + num); // 24

        // Compound division
        num /= 4; // Equivalent to num = num / 4
        System.out.println("After num /= 4: " + num); // 6

        // Compound modulus
        num %= 3; // Equivalent to num = num % 3
        System.out.println("After num %= 3: " + num); // 0
    }
}
