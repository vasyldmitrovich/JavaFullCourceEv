package com.softserve.edu07.homework.task1;

public class SalariedEmployee extends Employee implements Payment, Comparable<Employee> {
    private int hourlyPayment;
    private int workedHoursPerMonth;
    private String socialSecurityNumber;

    public SalariedEmployee() {
    }

    public SalariedEmployee(int hourlyPayment, int workedHoursPerMonth, String socialSecurityNumber) {
        this.hourlyPayment = hourlyPayment;
        this.workedHoursPerMonth = workedHoursPerMonth;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public SalariedEmployee(String name, String employeeID, int hourlyPayment, int workedHoursPerMonth, String socialSecurityNumber) {
        super(name, employeeID);
        this.hourlyPayment = hourlyPayment;
        this.workedHoursPerMonth = workedHoursPerMonth;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public int getHourlyPayment() {
        return hourlyPayment;
    }

    public void setHourlyPayment(int hourlyPayment) {
        this.hourlyPayment = hourlyPayment;
    }

    public int getWorkedHoursPerMonth() {
        return workedHoursPerMonth;
    }

    public void setWorkedHoursPerMonth(int workedHoursPerMonth) {
        this.workedHoursPerMonth = workedHoursPerMonth;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public String toString() {
        return "\nName: " + getName() +
                "\nEmployee ID: " + getEmployeeID() +
                "\nSocial security number: " + getSocialSecurityNumber() +
                "\nAverage monthly salary: " + calculatePaid();
    }

    @Override
    public int calculatePaid() {
        return hourlyPayment * workedHoursPerMonth;
    }

    @Override
    public int compareTo(Employee employee) {
        return -calculatePaid() + employee.calculatePaid();
    }
}
