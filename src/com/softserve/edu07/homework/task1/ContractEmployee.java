package com.softserve.edu07.homework.task1;

public class ContractEmployee extends Employee implements Payment {
    private String federalTaxIDMember;
    private int fixedMonthlyPayment;


    public ContractEmployee() {
    }

    public ContractEmployee(String name, String employeeID, String federalTaxIDMember, int fixedMonthlyPayment) {
        super(name, employeeID);
        this.federalTaxIDMember = federalTaxIDMember;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    public String getFederalTaxIDMember() {
        return federalTaxIDMember;
    }

    public void setFederalTaxIDMember(String federalTaxIDMember) {
        this.federalTaxIDMember = federalTaxIDMember;
    }

    public int getFixedMonthlyPayment() {
        return fixedMonthlyPayment;
    }

    public void setFixedMonthlyPayment(int fixedMonthlyPayment) {
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    @Override
    public int calculatePay() {
        return fixedMonthlyPayment;
    }

    @Override
    public String toString() {
        return "\nName: " + getName() + "\nEmployee ID: " + getEmployeeID() +
               "\nFederal tax ID member: " + getFederalTaxIDMember() +
               "\nBasic salary: ";
    }
}
