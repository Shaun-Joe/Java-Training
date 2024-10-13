package sixth;

public class VariableScopeExample {
    // Instance variable
    int instanceVar = 50;

    public void method1() {
        int localVar = 100; // Local variable
        System.out.println("From method1 - Local Variable: " + localVar);
        System.out.println("From method1 - Instance Variable: " + instanceVar);
    }

    public void method2() {
        // Uncommenting the next line will cause a compilation error
        // System.out.println(localVar); // Error: localVar cannot be resolved to a
        // variable
        System.out.println("From method2 - Instance Variable: " + instanceVar);
    }

    public static void main(String[] args) {
        VariableScopeExample example = new VariableScopeExample();
        example.method1();
        example.method2();
    }
}
