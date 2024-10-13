package Week2.ninth;

public class NumericPromotion {
    public static void main(String[] args) {
        // Declare variables of smaller types
        byte byteValue = 10;
        short shortValue = 20;
        char charValue = 'A'; // Character 'A' is promoted to its ASCII value (65)

        // Perform arithmetic operations with promotion
        int result1 = byteValue + shortValue; // byte and short are promoted to int
        double result2 = byteValue + charValue; // byte is promoted to int, then to double
        float result3 = shortValue * 2.5f; // short is promoted to float

        // Display results
        System.out.println("Result of byte + short (int): " + result1); // 30
        System.out.println("Result of byte + char (double): " + result2); // 75.0 (10 + 65)
        System.out.println("Result of short * 2.5 (float): " + result3); // 50.0 (20 * 2.5)

        // Mixed types
        long longValue = 100L;
        double result4 = shortValue / 2.0; // short promoted to double
        double result5 = byteValue + longValue; // byte promoted to long, then to double

        System.out.println("Result of short / 2.0 (double): " + result4); // 10.0 (20 / 2.0)
        System.out.println("Result of byte + long (double): " + result5); // 110.0 (10 + 100)
    }
}
