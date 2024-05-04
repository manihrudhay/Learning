package javaconcepts.multithreading;

class Counter {
    private  int count = 0;

    // Method to increment the count in a synchronized manner
    public synchronized void increment(String threadName) {
        count++;
//        System.out.println(threadName+ "-  Count:" +count);
    }

    // Method to get the current count
    public int getCount() {
        return count;
    }
}
