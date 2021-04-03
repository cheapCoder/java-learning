public class Singleton {
    private Singleton() {
    }

    private static Singleton instance = new Singleton();    // 饿汉式

//    public static Singleton getInstance() {
//        return Singleton.instance;
//    }
}

class SingletonTest {
    public static void main(String[] args) {
//        System.out.println(Singleton.getInstance() == Singleton.getInstance());

    }
}
