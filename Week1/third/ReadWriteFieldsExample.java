package third;

class Car {
    private String model;
    private int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    // Getter
    public String getModel() {
        return model;
    }

    // Setter
    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }
}

public class ReadWriteFieldsExample {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 2020);
        System.out.println("Model: " + car.getModel() + ", Year: " + car.getYear());

        // Updating the year
        car.setYear(2021);
        System.out.println("Updated Year: " + car.getYear());
    }
}
