package seventh;

public class GarbageCollectionExample {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is being destroyed: " + this);
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        GarbageCollectionExample obj = new GarbageCollectionExample();

        // Nullifying the reference
        obj = null;

        // Requesting garbage collection
        System.gc(); // Suggests to JVM to run garbage collection

        // Giving some time for GC to process
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
