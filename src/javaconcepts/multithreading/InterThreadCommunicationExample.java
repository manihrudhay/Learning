package javaconcepts.multithreading;

public class InterThreadCommunicationExample {
    public static void main(String[] args) {
        Data data = new Data();

        // Create producer and consumer threads
        Producer producer = new Producer(data);
        Consumer consumer = new Consumer(data);

        // Start the threads
        producer.start();
        consumer.start();
    }
}
