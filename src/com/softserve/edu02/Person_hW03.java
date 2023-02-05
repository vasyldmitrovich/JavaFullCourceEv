package com.softserve.edu02;

import java.time.Year;
import java.util.Date;
import java.util.Scanner;

public class Person_hW03 {
  private String firstName;
  private String lastName;
  private int birthYear;
  private int age;





    public Person_hW03(String firstName) {
           this.firstName = firstName;
    }


    public String getFirstName () {
            return firstName;
        }
        public void setFirstName (String firstName){
            this.firstName = firstName;
        }

        public String getLastName () {
            return lastName;
        }
        public void setLastName (String lastName){
            this.lastName = lastName;
        }

        public int getBirthYear () {
            return birthYear;
        }
        public void setBirthYear ( int birthYear){
            this.birthYear = birthYear;
        }
    private int birthYear() {
        return 0;
    }
        public int getAge () {
       int age = 2023;
        age=age-setBirthYear();
            return age;
        }
    int setBirthYear() {
        return birthYear;
    }








    @Override
    public String toString() {
        return "Person first name is - " + getFirstName() + "  Person last name is  - " + getLastName() +" "+ getAge ()+" years old";
    }
    Scanner input = new Scanner(System.in);






}


