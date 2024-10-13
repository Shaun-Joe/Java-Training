package Week2.fourteen;

public class DoWhileStatementExample {
    public static void main(String[] args) {
        int count = 1; // Initialize the counter

        System.out.println("Do-While Statement:");
        do {
            System.out.println("Count: " + count);
            count++; // Increment the counter
        } while (count <= 5); // Check the condition after executing the loop
    }
}
