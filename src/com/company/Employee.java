package com.company;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Employee {
    String lastName, firstName, IdNumber, sex;
    Date birthDate;

    public Employee(String LastName, String FirstName, String IDNumber, String Sex, Date BirthDate){
        this.lastName = LastName;
        this.firstName = FirstName;
        this.IdNumber = IDNumber;
        this.sex = Sex;
        this.birthDate = BirthDate;
    }


    public String toString() {


        SimpleDateFormat dateformat = new SimpleDateFormat("mm/dd/yy");

    // memecah tanggal dari string

        String str = "ID Employee Number: " + IdNumber + "\nEmployee Name: "

                + firstName + " " + lastName + "\nBirth Date: "

                + dateformat.format(birthDate);

        return str;

    }

    //set
    public void setLastName(String LastName){
        lastName = LastName;
    }

    public void setFirstName(String FirstName) {
        firstName = FirstName;
    }

    public void setSex(String Sex) {
        sex = Sex;
    }

    public void setIdNumber(String iDNumber) {
        IdNumber = iDNumber;
    }

    // get

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getIdNumber() {
        return IdNumber;
    }

    public String getSex() {
        return sex;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public abstract double monthlyEarning();

}
