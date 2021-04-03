package domain;

import javax.swing.*;

public class Employee {
    private int id;
    private String name;
    private int age;
    private double salary;


    public Employee(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }
}



