package Day11;


public class RunnableDemo implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread is running using Runnable...");
        for (int i=1;i<=5;i++) {
            System.out.println("Count: "+ i);
        }
        System.out.println("Thread finished.");
    }

    public static void main(String[] args) {

        RunnableDemo task=new RunnableDemo();
        Thread t=new Thread(task);
        t.start();

        System.out.println("Main thread is running...");
    }
}

