package Week2.eleventh;

public class AdditionalBinaryOperators {
    public static void main(String[] args) {
        int a = 5; // Binary: 0101
        int b = 3; // Binary: 0011

        // Bitwise AND
        int bitwiseAnd = a & b; // 0101 & 0011 = 0001(1)
        System.out.println("Bitwise AND: " + bitwiseAnd);

        // Bitwise OR
        int bitwiseOr = a | b; // 0101 | 0011 = 0111 (7)
        System.out.println("Bitwise OR: " + bitwiseOr);

        // Bitwise XOR
        int bitwiseXor = a ^ b; // 0101 ^ 0011 = 0110 (6)
        System.out.println("Bitwise XOR: " + bitwiseXor);

        // Left Shift
        int leftShift = a << 1; // 0101 << 1 = 10101 (10)
        System.out.println("Left Shift a by 1: " + leftShift);

        // Right Shift
        int rightShift = a >> 1; // 0101 >> 1 = 0010 (2)
        System.out.println("Right Shift a by 1: " + rightShift);

        // Ternary Operator
        String result = (a > b) ? "a is greater" : "b is greater or equal";
        System.out.println("Ternary Result: " + result);
    }
}
