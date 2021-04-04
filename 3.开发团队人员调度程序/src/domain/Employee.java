package domain;

public class Employee {
    private static final String FREE = "free";
    private static final String VOCATION = "vocation";
    private static final String BUSY = "busy";

    private int id;
    private String name;
    private int age;
    private double salary;
    private int memberId;
    private String status = Employee.FREE;

    public Employee(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String getStatus() {
        return status;
    }

    public void setStatusFree() {
        this.status = Employee.FREE;
    }
    public void setStatusVocation() {
        this.status = Employee.VOCATION;
    }

    public void setStatusBusy() {
        this.status = Employee.BUSY;
    }
}



