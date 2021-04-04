package domain;

public class Designer extends Employee {
    private double bonus;
    private Equipment equipment;

    public Designer(int id, String name, int age, double salary, double bonus, Equipment equipment) {
        super(id, name, age, salary);
        this.bonus = bonus;
        this.equipment = equipment;
    }

    public double getBonus() {
        return bonus;
    }

    public Equipment getEquipment() {
        return equipment;
    }
}