package javaconcepts.multithreading;

class IncrementerThread extends Thread {
    private Counter counter;

    public IncrementerThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment(Thread.currentThread().getName());
//            System.out.println(Thread.currentThread().getName()+ "-  Count:" + counter.getCount());
        }
    }
}
