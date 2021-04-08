class InnerClass {
    static class Dog {};
    class Bird {}

}

class Inner  {
    public static void main(String[] args) {
//        InnerClass.Dog dog = new InnerClass.Dog();
//        InnerClass inner = new InnerClass();
//        InnerClass.Bird bird =(new InnerClass()).new Bird();

        System.out.println(new Object(){});
    }
}