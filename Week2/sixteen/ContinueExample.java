package Week2.sixteen;

public class ContinueExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("Skipping even number: " + i);
                continue; // Skip the rest of the loop for even numbers
            }
            System.out.println("Odd number: " + i);
        }
    }
}
