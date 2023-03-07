package com.softserve.edu07.homeWork;

public class ContractEmployee extends Employee implements PaymentInterface {
    private int federalTaxIdmember;
    private int contractSalary;

    public ContractEmployee(int federalTaxIdmember, int contractSalary, String name, String employeedID) {
        super(name, employeedID);
        this.federalTaxIdmember = federalTaxIdmember;
        this.contractSalary = contractSalary;
    }

    public int getFederalTaxIdmember() {
        return federalTaxIdmember;
    }

    public void setFederalTaxIdmember(int federalTaxIdmember) {
        this.federalTaxIdmember = federalTaxIdmember;
    }

    public int getContractSalary() {
        return contractSalary;
    }

    public void setContractSalary(int contractSalary) {
        this.contractSalary = contractSalary;
    }

    @Override
    public int calculatePay() {
        return contractSalary;
    }

}
