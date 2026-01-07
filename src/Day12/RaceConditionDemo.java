package Day12;


public class RaceConditionDemo {

    static class BankAccount {
        private int balance = 2000;

        synchronized void withdraw(int amount, String who) {
            if (balance >= amount) {


                balance =balance-amount;
                System.out.println(who + " withdraw " + amount + ". Remaining balance = " + balance);
            } else {
                System.out.println(who + " tried to withdraw " + amount + " but insufficient funds. Balance = "+ balance);
            }
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Runnable r1=() -> account.withdraw(700, "Person-1");
        Runnable r2=() -> account.withdraw(700, "Person-2");
        Runnable r3=()-> account.withdraw(700,"person-3");

        Thread t1=new Thread(r1);
        Thread t2=new Thread(r2);
        Thread t3=new Thread(r3);

        t1.start();
        t2.start();
        t3.start();
        System.out.println("Final balance = " + account.balance);
    }
}

