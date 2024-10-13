package sixth;

public class DefaultInitialization {
    // Instance variable
    int instanceVar; // Default value: 0
    static int classVar; // Default value: 0
    char str;

    public static void main(String[] args) {
        DefaultInitialization obj = new DefaultInitialization();

        // Printing default values
        System.out.println("Default Instance Variables: " + obj.instanceVar);
        System.out.println("Default Class Variable: " + classVar);
        System.out.println(obj.str);

        // Local variable must be initialized
        // Uncommenting the next line will cause a compilation error
        // int localVar; 
        // System.out.println("Local Variable: " + localVar); // Error: variable localVar might not have been initialized
    }
}
