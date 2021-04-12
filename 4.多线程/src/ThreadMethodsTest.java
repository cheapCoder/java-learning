//public class ThreadMethodsTest {
//    public static void main(String[] args) {
//        Thread t = new MyThread("heng");
////        t.setName("heng");
//        t.setPriority(Thread.MAX_PRIORITY);
//        t.start();
//
//        for (int i = 0; i < 100; i++) {
//            System.out.println(Thread.currentThread().getName() + ":" + i + " Priority:" + Thread.currentThread().getPriority());
////            if(i == 20) {
////                try {
////                    t.join();
////                } catch (InterruptedException e) {
////                    e.printStackTrace();
////                }
////            }
//        }
//    }
//}

//class MyThread extends Thread {
//    public MyThread(String name) {
//        super(name);
//    }
//
//    @Override
//    public void run() {
//        for (int i = 0; i < 100; i++) {
//            System.out.println(this.getName() + ":" + i + " Priority:" + this.getPriority());
//
//        }
//    }
//
//}

//class MyThread implements Runnable {
//     private int lastTickets = 100;
//
//    @Override
//    public void run() {
//        while (true) {      // 循环未退出
////            synchronized (Windows.class) {
//            judge();
////            }
//        }
//    }
//
//    public synchronized void judge() {
//        if (lastTickets > 0) {
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println(Thread.currentThread().getName() + ": " + lastTickets);
//            lastTickets--;
//        }
//    }
//}

import java.util.concurrent.locks.ReentrantLock;

class MyThread implements Runnable {
    private int lastTickets = 100;
    private ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            try {
                lock.lock();
                if (lastTickets > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ": " + lastTickets);
                    lastTickets--;
                } else {
                    break;
                }
            } finally {
                lock.unlock();
            }
        }
    }
}


class InterfaceTest {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        new Thread(t).start();
        new Thread(t).start();
        new Thread(t).start();

    }
}