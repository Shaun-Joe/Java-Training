package Week2.sixteen;

public class LabeledLoopsExample {
    public static void main(String[] args) {
        outerLoop: for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i * j > 4) {
                    System.out.println("Breaking out of outer loop at i=" + i + ", j=" + j);
                    break outerLoop; // Breaks out of the outer loop
                }
                System.out.println("i=" + i + ", j=" + j);
            }
        }
    }
}
