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


class MyThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
//            System.out.println(this.getName() + ":" + i + " Priority:" + this.getPriority());
            System.out.println(i);
        }
    }
}

class  InterfaceTest {
    public static void main(String[] args) {
        new Thread(new MyThread()).start();

    }
}