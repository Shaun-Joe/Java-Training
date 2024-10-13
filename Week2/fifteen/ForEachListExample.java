package Week2.fifteen;

import java.util.ArrayList;
import java.util.List;

public class ForEachListExample {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // Using a for-each loop to iterate through the list
        for (Integer number : numbers) {
            System.out.println("Number: " + number);
        }
    }
}
