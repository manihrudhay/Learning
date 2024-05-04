package javaconcepts.multithreading;

class MyTask implements Runnable {
    private int taskId;

    public MyTask(int id) {
        this.taskId = id;
    }

    public void run() {
        System.out.println("Task " + taskId + " is executing.");
        // Simulate some task execution
        try {
            Thread.sleep(2000); // Sleep for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Task " + taskId + " completed.");
    }
}
