//public class InterfaceTest {
//    public static void main(String[] args) {
//    }
//}

//interface flyable {
//    public static final int MAX_SPEED = 7900;
//    int MIN_SPEED = 1;
//    public abstract void ear();
//}
//
//class fly implements flyable {
//
//    @Override
//    public void ear() {
//        System.out.println(this.MAX_SPEED);
//    }
//}


//interface USB {
//    int MAX = 1024;
//    public abstract void start ();
//    void stop();
//}
//
//class Flash implements USB {
//
//    @Override
//    public void start() {
//
//    }
//
//    @Override
//    public void stop() {
//
//    }
//}


interface Methods {
    public  int property = 1000;

    public static void method1() {
        System.out.println("method1");
    }

    public default void method2() {
        System.out.println("method2");
    }

    default void method3() {
        System.out.println("method3");
    }

    ;
}

class supMethod {
//    public static int property;
    public void method3() {
        System.out.println("sup method3");
    }
}


class MyMethods extends supMethod implements Methods {

    //    @Override
    public void method2() {
        System.out.println("override method2");
    }

    public static void main(String[] args) {
//        System.out.println(1);
//        Methods.method1();
//        new MyMethods().method3();
        System.out.println(MyMethods.property);
    }
}
