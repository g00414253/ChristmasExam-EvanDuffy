package org.example;

public class EmployeeApp {
    public static void main(String[] args) {
      Employee myEmployee = new Employee("Mark","756463");
      System.out.println(myEmployee.getReportDetails());

      ShiftWorker myShiftWorker = new ShiftWorker("Ben","8453475",1,8,13.50);
      System.out.println(myShiftWorker.getReportDetails());

      ShiftSupervisor myShiftSupervisor = new ShiftSupervisor("Luke","436456",2,8,17.50,100000);
      System.out.println(myShiftSupervisor.getReportDetails());
    }
}
