package Day12;


import java.util.concurrent.atomic.AtomicInteger;

public class AtomicVariableTicketBooking {

    static class TicketCounter {
        private AtomicInteger availableTickets=new AtomicInteger(10);

        public void book() {
            final int toBook = 5;
            while (true) {
                int current=availableTickets.get();
                if (current < toBook) {
                    System.out.println("Tried to book " + toBook + ", but only " + current + " left.");
                    break;
                }
                int updated = current - toBook;
                if (availableTickets.compareAndSet(current, updated)) {
                    System.out.println("Booked " + toBook + ". Remaining = " + updated);
                    break;
                }
            }
        }

        public int getRemaining() {
            return availableTickets.get();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        TicketCounter counter=new TicketCounter();

        Thread t1=new Thread(counter::book);
        Thread t2=new Thread(counter::book);

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Final tickets remaining = " + counter.getRemaining());
    }
}


