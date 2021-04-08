package view;

import domain.Architect;
import domain.Designer;
import domain.Employee;
import domain.Programmer;
import service.NameListService;
import service.TeamException;
import service.TeamService;

import java.net.SocketTimeoutException;
import java.time.temporal.Temporal;
import java.util.InputMismatchException;

public class TeamView {
    private NameListService listSvc = new NameListService();
    private TeamService teamSvc = new TeamService();


    private void listAllEmployees() {
        System.out.println("ID        姓名       年龄       工资       职位        状态        奖金        股票        领用设备");
        Employee[] allEmployees = this.listSvc.getAllEmployees();
        for (int i = 0; i < allEmployees.length; i++) {
//            System.out.println();
            Employee employee = allEmployees[i];
            System.out.print(String.format("%-10s", employee.getId()));
            System.out.print(String.format("%-10s", employee.getName()));
            System.out.print(String.format("%-10s", employee.getAge()));
            System.out.print(String.format("%-10s", employee.getSalary()));

            if (employee instanceof Programmer) {       // 程序员
                System.out.print("程序员    ");
                System.out.print(String.format("%-10s",employee.getStatus()));
                System.out.print("              ");
                System.out.print(String.format("%-10s", ((Programmer) employee).getEquipment().getDescription()));

            } else if (employee instanceof Designer) {
                System.out.print("设计师    ");
                System.out.print(String.format("%-10s",employee.getStatus()));
                System.out.print(String.format("%-10s", ((Designer) employee).getBonus()));
                System.out.print("       ");
                System.out.print(String.format("%-10s", ((Designer) employee).getEquipment().getDescription()));
            } else if (employee instanceof Architect) {
                System.out.print("架构师    ");
                System.out.print(String.format("%-10s",employee.getStatus()));
                System.out.print(String.format("%-10s", ((Architect) employee).getBonus()));
                System.out.print(String.format("%-10s", ((Architect) employee).getStock()));
                System.out.print(String.format("%-10s", ((Architect) employee).getEquipment().getDescription()));
            } else {        // 一定是Employee的子类
            }
            System.out.println();
        }
        System.out.println("----------------------------------------------------------------------------------------------\n");
    }

    private void listTeam() {
        System.out.println("--------------------团队成员列表---------------------\n");
        System.out.println("TDI/ID\t姓名\t\t年龄\t\t工资\t\t职位\t\t奖金\t\t股票");

        Employee[] team = teamSvc.getTeam();
        for (int i = 0; i < team.length; i++) {
            if (team[i] == null) {
                continue;
            }
            System.out.print(String.format("%-10s", team[i].getMemberId() + "/" + team[i].getId()));
            System.out.print(String.format("%-10s", team[i].getName()));
            System.out.print(String.format("%-10s", team[i].getAge()));
            System.out.print(String.format("%-10s", team[i].getSalary()));

            if (team[i] instanceof Programmer) {
                System.out.print(String.format("%-10s", "程序员"));
            } else if (team[i] instanceof Designer) {
                System.out.print(String.format("%-10s", "设计师"));
                System.out.print(String.format("%-10s", ((Designer) team[i]).getBonus()));
            } else if (team[i] instanceof Architect) {
                System.out.print(String.format("%-10s", "架构师"));
                System.out.print(String.format("%-10s", ((Architect) team[i]).getBonus()));
                System.out.print(String.format("%-10s", ((Architect) team[i]).getStock()));
            } else {
                System.out.print("多余者");
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------------------");
    }

    private void addMember() {
        System.out.print("请输入员工id：");
        int id = MyUtility.readId();
        try {
            this.teamSvc.addMember(this.listSvc.getEmployee(id));
        } catch (TeamException e) {
            System.out.println(e.getMessage());
        }
//        this.listTeam();
    }

    private void deleteMember() {
        System.out.print("请输入员工teamId：");
        int memberId = MyUtility.readId();
        try {
            this.teamSvc.removeMember(memberId);
        } catch (TeamException e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("团队中暂无此成员");
        } finally {
//            this.listTeam();
        }
    }

    public void enterMainMenu() {
        System.out.println("-------------------------------------开发团队调度软件--------------------------------------\n");
        this.listAllEmployees();
        while (true) {
            System.out.print("1-员工列表 2-开发人员列表 3-添加团队成员  4-删除团队成员 5-退出   请选择(1-5)：");
            int input = MyUtility.readMenuSelection();
            switch (input) {
                case 1: {
                    this.listAllEmployees();
                    break;
                }
                case 2: {
                    this.listTeam();
                    break;
                }
                case 3: {
                    this.addMember();
                    break;
                }
                case 4: {
                    this.deleteMember();
                    break;
                }
                case 5: {
                    System.out.println("确认退出？(按Y确认)：");
                    if (MyUtility.readConfimSelection()) {
                        System.out.println("程序结束，再回0^0");
                        return;
                    } else {
                        System.out.println("退出取消");
                    }
                }
                default: {
//                    System.out.println("输入不合法");
                }
            }

        }
    }

    public static void main(String[] args) {
        // bug: 要求输入数字的时候输入其他字符陷入死循环，scanner的问题
        new TeamView().enterMainMenu();
    }
}
