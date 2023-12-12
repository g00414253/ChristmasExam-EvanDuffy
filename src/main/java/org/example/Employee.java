package org.example;

public class Employee {
    private String Name;
    private String ID;

    public Employee() {
    }

    public Employee(String name, String ID) {
        Name = name;
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public String getID() {
        return ID;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getReportDetails() {
        return "Employee{" +
                "Name='" + Name + '\'' +
                ", ID='" + ID + '\'' +
                '}';
    }
}
