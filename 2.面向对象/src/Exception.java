import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception {
    @Test
    public static void main(String[] args) {
//        try {
//            final int a = 1234;
////            throw new NullPointerException("空指针异常");
//            throw new RuntimeException();
//        } catch (NullPointerException exception) {
////            System.out.println(exception.getMessage());
//            exception.printStackTrace();
//        } finally {
//            System.out.println("finally");
//        }
//        System.out.println("backward");
////        System.out.println(a);

        try {
            method();
        } catch (RuntimeException e) {
            System.out.println("main");
        }
    }

    public static void method() {
        try{
            System.out.println("enter");
            throw new RuntimeException("exception");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }finally{
            System.out.println("finally");
        }

    }
}

class SuperClass {
    public void method () throws IOException {}
}

class SonClass extends SuperClass {
    public void method () throws FileNotFoundException {}
}


// 自定义异常
//class MyException extends RuntimeException {
//    static final long serialVersionUID = -7034897745766939L;
//
//    public MyException() {
//        super();
//    }
//
//    public MyException (String msg) {
//        super(msg);
//    }
//
//}
//




