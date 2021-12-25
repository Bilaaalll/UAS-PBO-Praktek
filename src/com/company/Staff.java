package com.company;
import java.util.Date;

public class Staff extends Employee{

    double hourly_rate;


    public Staff(String firstname, String lastname, String id, String sex, Date BirthDate, double hourly_rate) {

        super(firstname, lastname, id, sex, BirthDate);

        this.hourly_rate = hourly_rate;
    }


    public double getHourly_rate() {

        return hourly_rate;

    }

    public void setHourly_rate(double hourly_rate) {

        this.hourly_rate = hourly_rate;

    }

    public String toString() {

        String str = super.toString() + "\nMonthly Salary: " + monthlyEarning();
        return str;
    }



    @Override
    public double monthlyEarning() {

        return hourly_rate * EmployeeHeader.STAFF_MONTHLY_HOURS_WORKED;

    }


}
