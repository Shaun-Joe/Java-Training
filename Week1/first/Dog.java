// Classes vs. Files

// File: Dog.java

/**
 * Dog
 */
public class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public void bark() {
        System.out.println(name + " says Woof!");
    }
}

// A seperate file could contain a non-public class

class DogOwner {
    public void callDog(Dog dog) {
        dog.bark();
    }
}