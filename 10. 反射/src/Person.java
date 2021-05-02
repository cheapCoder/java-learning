import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.management.MemoryUsage;

import static java.lang.annotation.ElementType.*;

@MyAnnotation("person class")
public class Person extends Creature<String> implements Comparable<Integer>, MyInterface {

    private String name;
    int age;
    public int id;

    public Person() {
//        System.out.println("Person()");
    }

    @MyAnnotation("only name constructor")
    private Person(String name) {
        this.name = name;
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @MyAnnotation("show")
    private String show(String nation) throws Exception {
        System.out.println("my nation is " + nation);
        return nation;
    }

    public String display(String interest) {
        return interest;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Integer o) {
        return 0;
    }

    @Override
    public void info() {
        System.out.println("info");
    }
    private static void staticMethod() {
        System.out.println("static method");
    }
}


class Creature<T> implements Serializable {
    private char gender;
    public double weight;

    private void breath() {
        System.out.println("is breath");
    }

    public void eat() throws RuntimeException {
        System.out.println("is eat");
    }
}


interface MyInterface {
    void info();
}

@Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE, MODULE})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {
    String[] value() default "hello world";
}