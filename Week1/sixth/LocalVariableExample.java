package sixth;

public class LocalVariableExample {
    public void display() {
        int localVar = 100; // Local variable
        System.out.println("Local Variable: " + localVar);
    }

    public static void main(String[] args) {
        LocalVariableExample example = new LocalVariableExample();
        example.display();

        // Uncommenting the next line will cause a compilation error
        // System.out.println(localVar); // Error: cannot find symbol
    }
}
