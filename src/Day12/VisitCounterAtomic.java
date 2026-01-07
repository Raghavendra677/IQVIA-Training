package Day12;


import java.util.concurrent.atomic.AtomicInteger;

public class VisitCounterAtomic {
    static class VisitCounter {
        private AtomicInteger count = new AtomicInteger(0);

        public void visit() {
            count.incrementAndGet();
        }

        public int getCount() {
            return count.get();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        VisitCounter counter = new VisitCounter();

        Runnable userHits = () -> {
            for (int i = 0; i < 1000; i++) {
                counter.visit();
            }
        };

        Thread t1 = new Thread(userHits);
        Thread t2 = new Thread(userHits);

        t1.start(); t2.start();
        t1.join(); t2.join();
        System.out.println("Total visits = " + counter.getCount());
    }
}




