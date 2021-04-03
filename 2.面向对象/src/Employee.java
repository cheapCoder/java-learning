import java.util.Calendar;

public abstract class Employee {
    private String name;
    private int number;
    private MyDate birthday;

    protected Employee(String name, int number, int year, int month, int day) {
        this.name = name;
        this.number = number;
        this.birthday = new MyDate(year, month, day);
    }

    public abstract int earnings();

//    public int getNumber() {
//        return number;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public MyDate getBirthday() {
//        return birthday;
//    }

    public String toString() {
        return "name=" + name + ", number=" + number + ", birthday=" + birthday.toDateString();
    }
}

class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String toDateString() {
        return this.year + "年" + this.month + "月" + this.day + "日";
    }
}


class SalariedEmployee extends Employee {
    private int monthlySalary;

    protected SalariedEmployee(String name, int number, int monthlySalaryint, int year, int month, int day) {
        super(name, number, year, month, day);
        this.monthlySalary = monthlySalaryint;
    }

    @Override
    public int earnings() {
        return this.monthlySalary;
    }

    public String toString() {
        return "[salariedEmployee" + super.toString() + "]";
    }
}


class PayrollSystem {
    public static void main(String[] args) {
//        Employee[] arr = new Employee[10];
        Calendar calandar = Calendar.getInstance();
        System.out.println(1);
        System.out.println(calandar.MONTH);
    }

}