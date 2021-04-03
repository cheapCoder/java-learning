package domain;

public class Architect extends Employee {
    private int stock;
    private double bonus;
    private Equipment equipment;

    public Architect(int id, String name, int age, double salary, double bonus, int stock,Equipment equipment) {
        super(id, name, age, salary);
        this.stock = stock;
        this.bonus = bonus;
        this.equipment = equipment;
    }
}
