package org.example;

public class ShiftSupervisor extends ShiftWorker {
    private double Salary;

    public ShiftSupervisor() {
    }

    public ShiftSupervisor(double salary) {
        Salary = salary;
    }

    public ShiftSupervisor(int shift, int payroll, double hourRate, double salary) {
        super(shift, payroll, hourRate);
        Salary = salary;
    }

    public ShiftSupervisor(String name, String ID, int shift, int payroll, double hourRate, double salary) {
        super(name, ID, shift, payroll, hourRate);
        Salary = salary;
    }

    public ShiftSupervisor(String name, String ID, double salary) {
        super(name, ID);
        Salary = salary;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    @Override
    public String getReportDetails() {
        return super.getReportDetails() + "{Salary=" + Salary +
                '}';
    }
}
