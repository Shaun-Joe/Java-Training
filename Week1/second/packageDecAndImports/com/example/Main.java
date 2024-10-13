// File: second/packageDecAndImports/com/example/Main.java
package second.packageDecAndImports.com.example;

// Importing the entire package using wildcard
import second.packageDecAndImports.com.example.utils.*;

public class Main {
    public static void main(String[] args) {
        int sum = MathUtils.add(5, 10);
        System.out.println("Sum: " + sum);
    }
}
