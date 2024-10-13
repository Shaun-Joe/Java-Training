// File: RedundantImportExample.java

package second;

import java.util.ArrayList; // Used
import java.util.List;      // Not used, this is a redundant import

@SuppressWarnings("unused")
public class RedundantImportExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        System.out.println(list);
    }
}
