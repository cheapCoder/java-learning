public class SubThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
    }
}

class TestThread {
    public static void main(String[] args) {

//        new SubThread().start();
//        for (int i = 100; i < 20000; i++ ) {
//            System.out.println(i + "###########################");
//        }

        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if (i % 2 == 0) {
                        System.out.println("even" + i);
                    }
                }
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if (i % 2 != 0) {
                        System.out.println("odd" + i);
                    }
                }
            }
        }.start();
    }
}