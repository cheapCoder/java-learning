package domain;

public class Programmer extends Employee {
//    private int memberId;
    private Equipment equipment;
    // private   Status status = FREE;

    public Programmer(int id, String name, int age, double salary, Equipment equipment) {
        super(id, name, age, salary);
        this.equipment = equipment;
    }


    public Equipment getEquipment() {
        return this.equipment;
    }

}