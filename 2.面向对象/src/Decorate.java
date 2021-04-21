class Decorate {
  public static void main(String[] args) {
    Animal a = new Animal(123);
    System.out.println(a.age);
    // a.change(20);
    // // a.age = 100;
    // a.show();

  }
}

class Animal {
  int age = 0;
  // public Animal() {
  //   System.out.println("animal");
  // }
  public Animal (int age) {
    this.age = age;
  }
  void show() {
    System.out.println(age);
  }

  void change(int value) {
    age = value;
  }
}
