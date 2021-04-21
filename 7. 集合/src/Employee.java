import javax.xml.crypto.Data;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Employee implements Comparable {
    public static void main(String[] args) {
//        1).使用comparable接口
//        TreeSet set = new TreeSet();


//        2).使用comparator接口
        TreeSet set = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Employee && o2 instanceof Employee) {
                    Employee castO1 = (Employee) o1;
                    Employee castO2 = (Employee) o2;
                    if (castO1.getBirthday().getYear() != castO2.getBirthday().getYear()) {
                        return castO1.getBirthday().getYear() - castO2.getBirthday().getYear();
                    } else if (castO1.getBirthday().getMonth() != castO2.getBirthday().getMonth()) {
                        return castO1.getBirthday().getMonth() - castO2.getBirthday().getMonth();
                    } else {
                        return castO1.getBirthday().getDay() - castO2.getBirthday().getDay();
                    }
                } else {
                    throw new RuntimeException("类型转换错误");
                }
            }
        });


        Employee e1 = new Employee("liudehua", 55, new MyDate(1965, 5, 4));
        Employee e2 = new Employee("zhangxueyou", 43, new MyDate(1987, 5, 4));
        Employee e3 = new Employee("guofucheng", 44, new MyDate(1987, 5, 9));
        Employee e4 = new Employee("liming", 51, new MyDate(1954, 8, 12));
        Employee e5 = new Employee("liangzhaowei", 21, new MyDate(1978, 12, 4));

        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

    private String name;
    private int age;
    private MyDate birthday;

    public Employee() {
    }

    public Employee(String name, int age, MyDate birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Employee) {
            Employee other = (Employee) o;
            return this.name.compareTo(other.name);
        } else {
            throw new RuntimeException("类型转换错误");
        }
    }
}


class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate() {
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }


    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}