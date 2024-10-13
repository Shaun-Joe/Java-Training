package Week2.eighth;

public class ArithmeticOperators {
    public static void main(String[] args) {
        double num1 = 8.0;
        double num2 = 3.0;

        System.out.println("Arithmetic Operators:");

        // Addition
        double sum = num1 + num2;
        System.out.println("Sum: " + sum); // 11.0

        // Subtraction
        double difference = num1 - num2;
        System.out.println("Difference: " + difference); // 5.0

        // Multiplication
        double product = num1 * num2;
        System.out.println("Product: " + product); // 24.0

        // Division
        double quotient = num1 / num2;
        System.out.println("Quotient: " + quotient); // 2.666...

        // Modulus
        double remainder = num1 % num2;
        System.out.println("Remainder: " + remainder); // 2.0
    }
}