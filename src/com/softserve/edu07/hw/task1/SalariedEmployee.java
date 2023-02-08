package com.softserve.edu07.hw.task1;

public class SalariedEmployee extends Employee implements Payment{
        private int hourlyRate;
        private int workHours;
        private String socialSecurityNumber;

    public SalariedEmployee(String employeeId, String name, int hourlyRate, int workHours, String socialSecurityNumber) {
        super(employeeId, name);
        this.hourlyRate = hourlyRate;
        this.workHours = workHours;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int salary) {
        this.hourlyRate = salary;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public int calculatePay() {
        return hourlyRate*workHours;
    }
}
