package seventh;

import java.util.ArrayList;
import java.util.Collections;

class StudentExample implements Comparable<StudentExample> {
    private String name;
    private int score;

    public StudentExample(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public int compareTo(StudentExample other) {
        return Integer.compare(this.score, other.score);
    }

    @Override
    public String toString() {
        return name + ": " + score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}

public class OrderingExample {
    public static void main(String[] args) {
        ArrayList<StudentExample> students = new ArrayList<>();
        students.add(new StudentExample("Alice", 85));
        students.add(new StudentExample("Bob", 90));
        students.add(new StudentExample("Charlie", 75));

        // Ordering students by score
        Collections.sort(students);

        System.out.println("Ordered Students:");
        for (StudentExample student : students) {
            System.out.println(student);
        }
    }
}
