public class PostMessage implements Runnable {
    private int num = 1;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                notify();
                if (num <= 100) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ": " + num);
                    num++;
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    break;
                }
            }
        }
    }
}

class TestPostMessage {
    public static void main(String[] args) {
        PostMessage t = new PostMessage();
        new Thread(t).start();
        new Thread(t).start();
        new Thread(t).start();

    }
}
