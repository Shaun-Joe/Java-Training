package fifth;

public class IdentifierExample {
    public static void main(String[] args) {
        // Valid Indentifiers
        int _myvariables = 10;
        int $anotherVariable = 20;
        byte variable1 = -128;

        // Invalid identifiers (uncommenting these will cause errors)
        // int 1variables = 40; // Cannot start with a number
        // int my-variable = 50; // Hyphen is not allowed

        // Printing the values
        System.out.println("_myVariable: " + _myvariables);
        System.out.println("$anotherVariable: " + $anotherVariable);
        System.out.println("variable1: " + variable1);

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
    }
}
