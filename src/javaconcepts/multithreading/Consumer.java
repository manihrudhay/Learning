package javaconcepts.multithreading;

class Consumer extends Thread {
    private Data data;

    public Consumer(Data data) {
        this.data = data;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            String message = data.consume();
            System.out.println("Consumer consumed: " + message);
        }
    }
}
