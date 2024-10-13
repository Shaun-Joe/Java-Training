package third;

class Cat {
    private String name;

    // Constructor
    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class ConstructorExample {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Whiskers");
        cat1.getName();
    }
}