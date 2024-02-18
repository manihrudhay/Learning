package designpatterns.creational.singleton;

import static java.lang.Thread.sleep;

public class SingletonMain {
    public static void main(String[] args) {
        ThreadSafeSingleton singleton = ThreadSafeSingleton.getInstance();

        // Thread 1
        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                singleton.incrementCount();
                System.out.println("Thread 1 - Count: " + singleton.getCount());
                try {
                    Thread.sleep(100); // Sleep for 100 milliseconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        // Thread 2
        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                singleton.incrementCount();
                System.out.println("Thread 2 - Count: " + singleton.getCount());
            }
        }).start();
    }
}
