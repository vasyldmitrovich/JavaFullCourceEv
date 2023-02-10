package com.softserve.edu07.homework.task1;

public class SalariedEmployee extends Employee implements Payment {
    private String socialSecurityNumber;
    private int hourlyRate;
    private int workedHours;

    public SalariedEmployee() {
    }

    public SalariedEmployee(String name, String employeeID, String socialSecurityNumber, int hourlyRate, int workedHours) {
        super(name, employeeID);
        this.socialSecurityNumber = socialSecurityNumber;
        this.hourlyRate = hourlyRate;
        this.workedHours = workedHours;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getWorkedHours() {
        return workedHours;
    }

    public void setWorkedHours(int workedHours) {
        this.workedHours = workedHours;
    }

    @Override
    public int calculatePay() {
        return workedHours*hourlyRate;
    }

    @Override
    public String toString() {
        return "\nName: " + getName() + "\nEmployee ID: " + getEmployeeID() +
                "\nSocial security number: " + getSocialSecurityNumber() +
                "\nBasic salary: ";
    }
}
