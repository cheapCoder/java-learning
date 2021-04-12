import com.sun.jdi.Value;

public class Account implements Runnable {
    private int balance;

    public  void changeBalance() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        balance = balance + 1000;
        System.out.println(Thread.currentThread().getName() + ": " + balance);

    }

    public void run() {
        this.changeBalance();
        this.changeBalance();
        this.changeBalance();
    }
}

class TestAccount {
    public static void main(String[] args) {
        Account a = new Account();
        new Thread(a).start();
        new Thread(a).start();
    }
}