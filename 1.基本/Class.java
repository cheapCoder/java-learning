
class LearnClass {
  public static void main(String[] args) {
    Person p1 = new Person();
    p1.sleep();
    // System.out.println(p1.isMale);
    // System.out.println(p1.age);
    // System.out.println(p1.name);

  }
}

class Person {
  boolean isMale;
  int age = 1;
  String name;
  static String what = "asdfasdf";

  static public void main(String[] args) {

  }

  public void eat() {
    System.out.println("吃东西");

  }

  public void sleep() {
    System.out.println("睡觉了");
    System.out.println(what);

  }

  public void talk() {
    System.out.println("讲话");
  }
}