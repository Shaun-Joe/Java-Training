package seventh;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.score, other.score);
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return name + ": " + score;
    }
}

public class JavaExample {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is being destroyed: " + this);
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // 1. Ordering elements in a class
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 85));
        students.add(new Student("Bob", 90));
        students.add(new Student("Charlie", 75));

        Collections.sort(students);
        System.out.println("Ordered Students:");
        for (Student student : students) {
            System.out.println(student);
        }

        // 2. Destroying objects and garbage collection
        JavaExample obj = new JavaExample();
        obj = null;
        System.gc(); // Suggests to JVM to run garbage collection

        // Pause for garbage collection to occur
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 3. Benefits of Java
        System.out.println("Java offers platform independence, automatic garbage collection, and a rich API.");
    }
}
