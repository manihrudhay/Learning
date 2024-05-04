package javaconcepts.multithreading;

public class SynchronizedExample {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        // Create multiple threads to increment the counter
        IncrementerThread thread1 = new IncrementerThread(counter);
        thread1.setName("thread1");
        IncrementerThread thread2 = new IncrementerThread(counter);
        thread2.setName("thread2");
        thread2.setPriority(Thread.MAX_PRIORITY);

        thread1.start();
        thread2.start();

        // Wait for both threads to finish
        thread1.join();
        thread2.join();

        // Print the final count
        System.out.println("Final count: " + counter.getCount());
    }
}
