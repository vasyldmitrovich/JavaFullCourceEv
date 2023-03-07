package com.softserve.edu07.homeWork;

public class SalariedEmployee extends Employee implements PaymentInterface{
    private String socialSecurityNumber;
    private int hourlyRate;
    private int hoursWork;

    public SalariedEmployee(String socialSecurityNumber, int hourlyRate, int hoursWork,String name, String employeedID) {
        super(name, employeedID);
        this.socialSecurityNumber = socialSecurityNumber;
        this.hourlyRate = hourlyRate;
        this.hoursWork = hoursWork;
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

    public int getHoursWork() {
        return hoursWork;
    }

    public void setHoursWork(int hoursWork) {
        this.hoursWork = hoursWork;
    }

    @Override
    public int calculatePay() {
        return hourlyRate*hoursWork;
    }
}
