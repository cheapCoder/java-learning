package service;

import domain.Employee;

public class TeamService {
    private int counter = 1;
    private final int MAX_MEMBER = 5;
    private Employee[] employees = new Employee[MAX_MEMBER];
    private int total = 0;

    public TeamService() {

    }

    public Employee[] getTeam() {
        return this.employees;
    }

    public void addMember(Employee employee) throws TeamException {

        this.total++;
    }

    public void removeMember(int memberId) throws TeamException {

    }
}
