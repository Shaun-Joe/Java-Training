package sixth;

public class InstanceAndClassVariables {
    // Instance Variable
    int instanceVar;

    // Class variable
    static int classVar;

    public void setInstanceVar(int value) {
        instanceVar = value; // Set instance variable
    }

    public static void setClassVar(int value) {
        classVar = value; // Set class variable
    }

    public void display() {
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Class Variable: " + classVar);
    }

    public static void main(String[] args) {
        InstanceAndClassVariables obj1 = new InstanceAndClassVariables();
        InstanceAndClassVariables obj2 = new InstanceAndClassVariables();

        obj1.setInstanceVar(10);
        obj2.setInstanceVar(20);
        InstanceAndClassVariables.setClassVar(30);

        obj1.display(); // Instance Variable: 10, Class Variable: 30
        obj2.display(); // Instance Variable: 20, Class Variable: 30
    }
}
