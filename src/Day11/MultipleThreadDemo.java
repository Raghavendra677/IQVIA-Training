package Day11;


public class MultipleThreadDemo extends Thread {

    private String threadName;

    public MultipleThreadDemo(String name) {
        this.threadName=name;
    }

    @Override
    public void run() {
        System.out.println(threadName + " is running");
        for (int i = 1;i<= 5; i++) {
            System.out.println(threadName + " -Count: " +i);
        }
        System.out.println(threadName+"finished.");
    }

    public static void main(String[] args) {
        MultipleThreadDemo t1 = new MultipleThreadDemo("Thread-1");
        MultipleThreadDemo t2 = new MultipleThreadDemo("Thread-2");
        t1.start();
        t2.start();

        System.out.println("Main thread is running");
    }
}

