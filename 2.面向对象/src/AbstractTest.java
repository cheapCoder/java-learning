

public class AbstractTest {
    public static void main(String[] args) {
//        Person person = new Person();
//        person.eat();
    }
}

abstract class Person {
    String name;
    int age;
    public Person () {

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void eat (){
        System.out.println("eat");
    }
    protected abstract void sleep();
}

class Student extends Person {
    public void sleep () {}
}