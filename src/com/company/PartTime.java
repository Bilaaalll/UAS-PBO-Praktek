package com.company;

import java.util.Date;

public class PartTime extends Staff{
    int hours_worked_per_week;

    public PartTime(String firstname, String lastname, String id, String sex, Date BirtDate, double hourly_rate, int hours_worked_per_week) {
        super(firstname, lastname, id, sex, BirtDate, hourly_rate);

        this.hours_worked_per_week = hours_worked_per_week;
    }

    public double monthlyEarning() {

        return hourly_rate * hours_worked_per_week * 4;

    }

    public int getHours_worked_per_week() {

        return hours_worked_per_week;

    }

    public void setHours_worked_per_week(int hours_worked_per_week) {

        this.hours_worked_per_week = hours_worked_per_week;

    }

    public String toString() {

        return super.toString() + "\nHours worked per month: " + (hours_worked_per_week * 4);

    }

}
