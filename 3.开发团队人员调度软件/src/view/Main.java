package view;

import domain.Employee;
import service.Data;

import java.awt.desktop.QuitEvent;
import java.lang.reflect.Array;


public class Main {
    public static void main(String[] args) {
//        System.out.println(Data.EMPLOYEES.toString());
        System.out.println("-------------------------------------开发团队调度软件--------------------------------------\n");
        System.out.println("ID     姓名      年龄    工资         职位      状态      奖金        股票     领用设备");
        for (int i = 0; i < Data.EMPLOYEES.length; i++) {
            String[] employee = Data.EMPLOYEES[i];
            String[] equipment = Data.EQUIPMENTS[i];
            System.out.println(employee[1] + "  " + employee[2] + "  " + employee[4] + "free" + "  " + employee[5] + employee[6] + "  " + equipment[1] + "(" + equipment[2] + ")");
        }
    }

}
