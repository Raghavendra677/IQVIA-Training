package Day11;



public class ParallelTasksDemo {
    static class Task implements Runnable {
        private final String name;
        Task(String name) {
            this.name = name;
        }
        public void run() {
            System.out.println(name +"code executed by: " +Thread.currentThread().getName() +" started.");
            System.out.println(name + " finished.");
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new Task("Downloader"));
        Thread t2 = new Thread(new Task("Compressor"));
        Thread t3 = new Thread(new Task("Uploader"));
        t1.start();
        t2.start();
        t3.start();
        System.out.println("Main thread running...");
    }
}

