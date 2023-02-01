package com.softserve.edu02;
import java.util.ArrayList;

public class Employee {
  private static float totalSum;
  private String name;
  private float rate;
  private float hours;
  private static final ArrayList<Employee> allEmployes = new ArrayList<>();

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  public void setHours(float rate) {
    this.hours = hours;
  }

  public static float getTotalSum() {
    return totalSum;
  }
  public static float getTotalHours() {
    int totalHours = 0;
    for (Employee employee : allEmployes) {
      totalHours += employee.getHours();
    }
    return totalHours;
  }

  private byte getHours() {
    return 0;
  }

  public static float getAvrHours() {
    return Employee.getTotalHours()/allEmployes.size();
  }

  public static boolean betterEmployee(Employee x) {
    int hours;
    for (Employee employee : allEmployes) {
      hours = employee.getHours();
      if (hours > x.getHours())
        return false;
    }
    return true;
  }
  public Employee() {
    totalSum++;
    allEmployes.add(this);
  }
  public Employee(String name) {
    this();
    this.name = name;
  }
  public Employee(String name, float hours) {
    this();
    this.name = name;
    this.hours = hours;
  }

  @Override
  public String toString() {
    return "Employee name is - " + getName() + "! Hours is - " + getHours();
  }



}
