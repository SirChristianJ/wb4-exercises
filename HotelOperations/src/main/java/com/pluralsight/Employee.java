package com.pluralsight;

import java.util.UUID;

public class Employee {
    private static int idCounter = 1;
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    public Employee( String name, String department, double payRate, double hoursWorked) {
        this.employeeId = idCounter++;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getNormalHours(){
        double normalHours = getHoursWorked();
        if(getHoursWorked() <= 40){
            return normalHours;
        }

        else
            return getHoursWorked() - getOverTimeHours();
    }

    public double getOverTimeHours(){
        double extraHours = 0;

        if(getHoursWorked() > 40){
            extraHours = getHoursWorked() - 40;
        }

        return extraHours;
    }

    public double getTotalPay(){
        return (getNormalHours()*getPayRate())+(getOverTimeHours())*(getPayRate()*1.5);
    }
}
