public class Singleton {
    //    Singleton () {
//    }
    private static Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return Singleton.instance;
    }
}

class SingletonTest {
    public static void main(String[] args) {
        System.out.println(Singleton.getInstance() == Singleton.getInstance());
    }
}
