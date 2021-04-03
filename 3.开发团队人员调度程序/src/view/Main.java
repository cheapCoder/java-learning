package view;

import domain.Employee;
import service.Data;


public class Main {
    public static void main(String[] args) {
        Main.printAll();
        int input;
        System.out.print("1-团队列表  2-添加团队成员  3-删除团队成员 4-退出   请选择(1-4):");
        input = MyUtility.readMenuSelection();
        while (true) {
//            Main.printAll();
            System.out.print("1-团队列表  2-添加团队成员  3-删除团队成员 4-退出   请选择(1-4):");
            input = MyUtility.readMenuSelection();
            switch (input) {
                case 1: {
                    Main.printAll();
                    break;
                }
                case 2: {
                    break;
                }
                case 3: {
                    break;
                }
                case 4: {
                    System.out.println("程序结束，再回0^0");
                    return;
                }
            }
        }
    }

    public static void printAll() {

        System.out.println("-------------------------------------开发团队调度软件--------------------------------------\n");
        System.out.println("ID     姓名     年龄     工资     职位     状态     奖金     股票     领用设备");
        for (int i = 0; i < Data.EMPLOYEES.length; i++) {
            String[] employee = Data.EMPLOYEES[i];
            String[] equipment = Data.EQUIPMENTS[i];
//            System.out.println(String.format("%-7s",employee[2]);
            System.out.println((employee.length >= 2 ? String.format("%-7s", employee[1]) : "       ") + (employee.length >= 3 ? String.format("%-7s", employee[2]) : "       ") + (employee.length >= 4 ? String.format("%-7s", employee[3]) : "       ") + (employee.length >= 5 ? String.format("%-7s", employee[4]) : "       ") + String.format("%-7s", Data.getWorkType(employee[0])) + "free   " + (employee.length >= 6 ? String.format("%-7s", employee[5]) : "       ") + (employee.length >= 7 ? String.format("%-7s", employee[6]) : "       ") + (equipment.length >= 2 ? equipment[1] : "       ") + (equipment.length >= 3 ? "(" + equipment[2] + ")" : "       "));
        }
        System.out.println("----------------------------------------------------------------------------------------------");
    }
}
