
package com.softserve.edu03.Practical_task;

public class Employee {
  private static float totalSum;
  private String name;
  private float rate;
  private float hours;
  private float salary;
  private float bonuses;

    public String getName() {
      return name;
    }
  public void setName(String name) {
    this.name = name;
  }
  public float getRate() {
    return rate;
  }
  public void setRate(float rate) {
    this.rate = rate;
  }

  public float getHours() {
    return hours;
  }
  public void setHours(float hours) {
    this.hours = hours;
  }

  public Employee(String name, float hours) {
    this.name = name;
    this.hours = hours;
  }

  public float getSalary() {
    salary= (getRate() * getHours());
    return salary;
  }

  @Override
  public String toString() {
    return "Employee name is - " + getName() + "! Worked for hours - " + getHours()+" Salary " + (getRate() * getHours());
  }
}
