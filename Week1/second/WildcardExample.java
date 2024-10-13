package second;

// import java.util.ArrayList;
// import java.util.List;
import java.util.*;

public class WildcardExample {

    // Method using an unbound wildcard
    public static void printList(List<?> list) {
        for (Object element : list) {
            System.out.println(element);
        }
    }

    // Method using an upper bounded wildcard
    public static void processNumbers(List<? extends Number> list) {
        for (Number num : list) {
            System.out.println(num.doubleValue());
        }
    }

    // Mwthod using a lower bounded wildcard
    public static void addIntegers(List<? super Integer> list) {
        list.add(1);
        list.add(2);
    }

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");

        List<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(20);

        // Using unbounded wildcard
        System.out.println("Printing string list:");
        printList(stringList);

        // Using upper bounded wildcard
        System.out.println("\nProcessing number list:");
        processNumbers(intList);

        // Using lower bound wildcard
        List<Number> numberList = new ArrayList<>();
        addIntegers(numberList);
        System.out.println("\nAfter adding integers: ");
        printList(numberList);
    }
}
