package org.example;

public class ShiftWorker extends Employee {
    private int Shift;
    private int Payroll;
    private double HourRate;

    public ShiftWorker() {
    }

    public ShiftWorker(int shift, int payroll, double hourRate) {
        Shift = shift;
        Payroll = payroll;
        HourRate = hourRate;
    }

    public ShiftWorker(String name, String ID, int shift, int payroll, double hourRate) {
        super(name, ID);
        Shift = shift;
        Payroll = payroll;
        HourRate = hourRate;
    }

    public ShiftWorker(String name, String ID) {
        super(name, ID);
    }

    public int getShift() {
        return Shift;
    }

    public int getPayroll() {
        return Payroll;
    }

    public double getHourRate() {
        return HourRate;
    }

    public void setShift(int shift) {
        Shift = shift;
    }

    public void setPayroll(int payroll) {
        Payroll = payroll;
    }

    public void setHourRate(double hourRate) {
        HourRate = hourRate;
    }

    @Override
    public String getReportDetails(){
        return super.getReportDetails() +
                "{Shift=" + Shift +
                        ", Payroll=" + Payroll +
                        ", HourRate=" + HourRate +
                        '}';
    }
}
