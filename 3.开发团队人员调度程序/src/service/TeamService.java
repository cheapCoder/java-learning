package service;

import domain.Employee;

public class TeamService {
    //    private int counter = 1;
    private final int MAX_MEMBER = 5;
    private Employee[] employees = new Employee[MAX_MEMBER];
    private int total = 0;

    public int getTotal() {
        return total;
    }

    public Employee[] getTeam() {
        return this.employees;
    }

    public void addMember(Employee employee) throws TeamException {
        System.out.println(employee.getId());
        if (this.total == this.MAX_MEMBER) {
            throw new TeamException("添加失败，成员数量已达到最大值");
        }

        int location = -1;
        for (int i = 0; i < this.employees.length; i++) {
            if (this.employees[i] == null) {
                location = location == -1 ? i : location;
                continue;
            }
            if (this.employees[i].getId() == employee.getId()) {
                throw new TeamException("员工已存在");
            }
        }
        employee.setMemberId(location + 1);
        employee.setStatusBusy();
        this.employees[location] = employee;
        this.total++;
        System.out.println("添加成功");
        return;
    }

    public void removeMember(int memberId) throws TeamException, NullPointerException {
        for (int i = 0; i < this.employees.length; i++) {
            if (this.employees[i].getMemberId() == memberId) {
                this.employees[i].setStatusFree();
                this.employees[i] = null;
                total--;
                System.out.println("删除成功");
                return;
            }
        }
        throw new TeamException("无此成员");
    }
}
