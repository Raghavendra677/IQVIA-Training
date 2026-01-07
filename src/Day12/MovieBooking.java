package Day12;


public class MovieBooking {
    static class TicketCounter {
        private int availableTickets=10;

        synchronized void book() {
            if (availableTickets >= 0) {
                availableTickets=availableTickets-1;
                System.out.println("Booked " + ".Remaining = " + availableTickets);
            } else {
                System.out.println("Tried to book "  + ", but only " + availableTickets + " left.");
            }
        }
        public int getRemaining() {
            return availableTickets;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        TicketCounter counter = new TicketCounter();

        Runnable user1 =()-> counter.book();
        Runnable user2 =()-> counter.book();
        Thread t1 = new Thread(user1);
        Thread t2 = new Thread(user2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final tickets remaining = " + counter.getRemaining());
    }
}

