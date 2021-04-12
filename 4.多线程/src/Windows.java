class Windows extends Thread {
    static private int lastTickets = 100;
    static Object lock = new Object();

    @Override
    public void run() {
        while (true) {       // 循环未退出
//            synchronized (Windows.class) {
            judge();
//            }
        }
    }

    static public synchronized void judge() {
        if (lastTickets > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ": " + lastTickets);
            lastTickets--;
        }
    }
}

class Test {
    public static void main(String[] args) {
//         Windows w1 = new Windows();
//         Windows w2 = new Windows();
//         Windows w3 = new Windows();
        new Windows().start();
        new Windows().start();
        new Windows().start();
    }
}

