package com.softserve.edu07.hw.task1;

public class ContractEmployee extends Employee implements Payment{
        private int contractSalary;
        private int federalTaxIdMember;

    public ContractEmployee(String employeeId, String name, int contractSalary, int federalTaxIdMember) {
        super(employeeId, name);
        this.contractSalary = contractSalary;
        this.federalTaxIdMember = federalTaxIdMember;
    }

    public int getContractSalary() {
        return contractSalary;
    }

    public void setContractSalary(int contractSalary) {
        this.contractSalary = contractSalary;
    }

    public int getFederalTaxIdMember() {
        return federalTaxIdMember;
    }

    public void setFederalTaxIdMember(int federalTaxIdMember) {
        this.federalTaxIdMember = federalTaxIdMember;
    }

    @Override
    public int calculatePay() {
        return contractSalary;
    }
}
