package com.company;
import java.util.logging.Level;
import java.util.Date;
public class Faculty extends Employee{

    Level level;

    Education education;

    public Faculty(String firstname, String lastname, String id, String sex, Date BirthDate, Level level, Education education) {

        super(firstname, lastname, id, sex, BirthDate);

        this.level = level;

        this.education = education;

    }

    enum Level {

        AS,

        AO,

        FU

    }

    public Level getLevel() {

        return level;

    }

    public void setLevel(Level level) {

        this.level = level;

    }

    public Education getEducation() {

        return education;

    }

    public void setEducation(Education education) {

        this.education = education;

    }

    public String toString() {

        String proffesion = " ";
        if (level == Level.AS) {
            proffesion =  "Assistant Professor";
        } else if (level == Level.AO) {
            proffesion = "Associate Professor";
        } else if (level == Level.FU) {
            proffesion = "Full Professor";
        }
        String str = super.toString() + "\n" +proffesion + "\nMonthly Salary: " + monthlyEarning();
        return str;

    }

//    public String ToString(){
//        if(getLevel() == Level.AS)
//            return "Assistant Professor";
//        else if(getLevel() == Level.AO)
//            return "Assosciate Professor";
//        else
//            return "Professor";
//    }

    @Override
    public double monthlyEarning() {
        if (level == Level.AS) {
            return EmployeeHeader.FACULTY_MONTHLY_SALARY;
        } else if (level == Level.AO) {
            return (1.5 * EmployeeHeader.FACULTY_MONTHLY_SALARY);
        } else if (level == Level.FU) {
            return (2 * EmployeeHeader.FACULTY_MONTHLY_SALARY);
        }
        return 0;
    }

}
