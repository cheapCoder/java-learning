public class Sale {
    static public int count;
    static Object lock = new Object();

    public static void main(String[] args) {
        Thread product = new Product();
        Thread consumption = new Thread(new Consumption());
        product.setName("product");
        consumption.setName("consumption");
        product.start();
        consumption.start();
    }
}

class Product extends Thread {
    @Override
    public void run() {
        System.out.println("product");
        while (true) {
            synchronized (Sale.lock) {
                if (Sale.count == 20) {
                    try {
                        Sale.lock.wait();
                    } catch (InterruptedException e) {
                        System.out.println(e.getMessage());
                    }
                } else {
//                    Sale.count++;
                    System.out.println(Thread.currentThread().getName() + ": " + ++Sale.count  );
//                    if (Sale.count > 0) {     //这里一定大于0
                        Sale.lock.notify();
//                    }
                }

            }
        }
    }
}

class Consumption implements Runnable {
    @Override
    public void run() {
        System.out.println("consumption");
        while (true) {
            synchronized (Sale.lock) {
                if (Sale.count == 0) {
                    try {
                        Sale.lock.wait();
                    } catch (InterruptedException e) {
                        System.out.println(e.getMessage());
                    }
                } else {
//                    Sale.count--;
                    System.out.println(Thread.currentThread().getName() + ": " + --Sale.count);
//                    if (Sale.count < 20) {        //这里一定小于20
                        Sale.lock.notify();
//                    }
                }

            }
        }
    }
}