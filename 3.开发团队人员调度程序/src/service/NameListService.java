package service;

import domain.*;


public class NameListService {
    private Employee[] employees;

    // 构造器
    public NameListService() {
        this.employees = new Employee[Data.EMPLOYEES.length];
        for (int i = 0; i < Data.EMPLOYEES.length; i++) {
            String[] employee = Data.EMPLOYEES[i];
            String[] currentEquipment = Data.EQUIPMENTS[i];

            int Id = Integer.parseInt(employee[1]);
            String name = employee[2];
            int age = Integer.parseInt(employee[3]);
            double salary = Double.parseDouble(employee[4]);
//            生成equipment
            Equipment equipment = null;
            if (currentEquipment.length > 0) {
                if (currentEquipment[0] == "21") {
                    equipment = new PC(currentEquipment[1], currentEquipment[2]);
                } else if (currentEquipment[0] == "22") {
                    equipment = new Notebook(currentEquipment[1], Double.parseDouble(currentEquipment[2]));
                } else if (currentEquipment[0] == "23") {
                    equipment = new Printer(currentEquipment[1], currentEquipment[2]);
                }
            }

            if (employee[0] == "10") {
                this.employees[i] = new Employee(Id, name, age, salary);
            } else if (employee[0] == "11") {
                this.employees[i] = new Programmer(Id, name, age, salary, equipment);

            } else if (employee[0] == "12") {
                double bonus = Double.parseDouble(employee[5]);

                this.employees[i] = new Designer(Id, name, age, salary, bonus, equipment);
            } else if (employee[0] == "13") {
                double bonus = Double.parseDouble(employee[5]);
                int stock = Integer.parseInt(employee[6]);
                this.employees[i] = new Architect(Id, name, age, salary, bonus, stock, equipment);
            } else {
                System.out.println("初始化员工信息错误，请检查员工信息！");
            }
        }
    }

    public Employee[] getAllEmployees() {
        return this.employees;
    }

    public Employee getEmployee(int id) throws TeamException {
        for (int i = 0; i < this.employees.length; i++) {
            if (this.employees[i].getId() == id) {
                return this.employees[i];
            }
        }
        throw new TeamException("员工信息未查到");
    }
}


