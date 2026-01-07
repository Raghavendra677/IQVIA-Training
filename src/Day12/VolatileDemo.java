package Day12;


public class VolatileDemo {
    static class Worker extends Thread {
        volatile boolean running = true;

        public void run() {
            System.out.println("Worker started.");
            while (running) {

            }
            System.out.println("Worker stopped.");
        }
        public void stopWork() {
            running = false;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Worker worker = new Worker();
        worker.start();

        Thread.sleep(2000);
        System.out.println("Manager says stop!");
        worker.stopWork();
    }
}

