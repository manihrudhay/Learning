package javaconcepts.multithreading;

class Producer extends Thread {
    private Data data;

    public Producer(Data data) {
        this.data = data;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            data.produce("Message " + i);
            try {
                Thread.sleep(1000); // Simulate some delay between producing messages
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
