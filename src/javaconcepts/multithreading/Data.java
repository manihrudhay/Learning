package javaconcepts.multithreading;

class Data {
    private String message;
    private boolean isNewMessage = false;

    // Method to produce a new message
    public synchronized void produce(String message) {
        // Wait until the previous message is consumed
        while (isNewMessage) {
            try {
                wait(); // Wait for the consumer to consume the message
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        this.message = message;
        isNewMessage = true;
        System.out.println("Producer produced: " + message);
        notify(); // Notify the consumer that a new message is available
    }

    // Method to consume the message
    public synchronized String consume() {
        // Wait until a new message is available
        while (!isNewMessage) {
            try {
                wait(); // Wait for the producer to produce a new message
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        isNewMessage = false;
        notify(); // Notify the producer that the message has been consumed
        return message;
    }
}
