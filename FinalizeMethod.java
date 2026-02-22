public class FinalizeMethod {

    // This method is called by the Garbage Collector before destroying the object
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method called: Cleaning up resources before object is removed.");
    }

    public static void main(String[] args) {
        // 1. Create two objects
        FinalizeMethod obj1 = new FinalizeMethod();
        FinalizeMethod obj2 = new FinalizeMethod();

        // 2. Make the objects eligible for Garbage Collection by setting them to null
        obj1 = null;
        obj2 = null;

        // 3. Manually request the JVM to run Garbage Collector
        // Note: System.gc() only "requests" GC; it doesn't guarantee it will run immediately.
        System.out.println("Requesting Garbage Collector...");
        System.gc();

        System.out.println("Main method finished.");
    }
}