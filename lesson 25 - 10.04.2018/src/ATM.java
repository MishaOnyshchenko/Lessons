import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ATM extends Thread {

    private double balance = 1200;
    private String currency = "UAH";
    private Lock lock = new ReentrantLock();

    public void getMoney(double money) {

        lock.lock();
        try {
            if (balance - money > 0) {
                balance -= money;
                System.out.println("You have " + money);
            } else if (balance - money < 0) {
                System.out.println("You don't have enough money. Your balance is " + balance);
            } else {
                System.out.println("You are empty");
            }
        } finally {
            lock.unlock();
        }
    }

    public ATM(double money) {
        getMoney(money);
    }
    public ATM() {

    }

}
