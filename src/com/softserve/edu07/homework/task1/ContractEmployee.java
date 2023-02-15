package com.softserve.edu07.homework.task1;

public class ContractEmployee extends Employee implements Payment, Comparable<Employee>{
    private int fixedMonthlyPayment;
    private String federalTaxIDMember;

    public ContractEmployee() {
    }

    public ContractEmployee(int fixedMonthlyPayment, String federalTaxIDMember) {
        this.fixedMonthlyPayment = fixedMonthlyPayment;
        this.federalTaxIDMember = federalTaxIDMember;
    }

    public ContractEmployee(String name, String employeeID, int fixedMonthlyPayment, String federalTaxIDMember) {
        super(name, employeeID);
        this.fixedMonthlyPayment = fixedMonthlyPayment;
        this.federalTaxIDMember = federalTaxIDMember;
    }

    public int getFixedMonthlyPayment() {
        return fixedMonthlyPayment;
    }

    public void setFixedMonthlyPayment(int fixedMonthlyPayment) {
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    public String getFederalTaxIDMember() {
        return federalTaxIDMember;
    }

    public void setFederalTaxIDMember(String federalTaxIDMember) {
        this.federalTaxIDMember = federalTaxIDMember;
    }

    @Override
    public String toString() {
        return "\nName: " + getName() +
                "\nEmployee ID: " + getEmployeeID() +
                "\nFederal tax ID member: " + getFederalTaxIDMember() +
                "\nAverage monthly salary: " + calculatePaid();
    }

    @Override
    public int calculatePaid() {
        return fixedMonthlyPayment;
    }

    @Override
    public int compareTo(Employee employee) {
        return -calculatePaid() + employee.calculatePaid();
    }
}
