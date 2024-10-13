package fourth;

public class ReferenceTypes {
    public static void main(String[] args) {
        // Create a String object (reference type)
        String myString = new String("Hello, World!");
        System.out.println("String: " + myString);

        // Create an array (also a referenec type)
        int[] myArray = { 1, 2, 3, 4, 5 };
        System.out.println("Array element: " + myArray[0]);

        // Create an instance of a custom class
        Person person = new Person("Alice", 30);
        System.out.println("Person: " + person.getName() + ", Age: " + person.getAge());
    }

    static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }
}
