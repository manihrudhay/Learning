package designpatterns.creational.singleton;

public class ThreadSafeSingleton {
    private static volatile ThreadSafeSingleton instance;
    private int count;
    private ThreadSafeSingleton() {
        count = 0;
    }

    public static ThreadSafeSingleton getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }

    public int getCount() {
        return count;
    }

    public synchronized void incrementCount() {
        count++;
    }
}
