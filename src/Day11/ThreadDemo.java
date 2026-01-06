package Day11;


public class ThreadDemo extends Thread {

    @Override
    public void run() {
        System.out.println("Thread is running...");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
        }
        System.out.println("Thread finished.");
    }

    public static void main(String[] args) {
        ThreadDemo t = new ThreadDemo();
        t.start();
        System.out.println("Main thread is running...");
    }
}
