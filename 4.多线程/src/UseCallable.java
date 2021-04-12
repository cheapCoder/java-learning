import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class UseCallable implements Callable {
    @Override
    public Object call() throws Exception {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
            sum += i;
        }
        return sum;
    }
}

class TestCallable {
    public static void main(String[] args) {
        FutureTask ft = new FutureTask(new UseCallable());
        Thread thread = new Thread(ft);
        thread.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("main: " + i);
        }
        try {
            System.out.println(ft.get());

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
