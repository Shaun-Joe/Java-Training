package third;

class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class CreateObjectExample {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Buddy");
        System.out.println("Dog's name: " + dog1.getName());
    }
}
