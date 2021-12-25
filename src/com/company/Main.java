package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

public class Main {

    public static void main(String[] args) {


        SimpleDateFormat sdf = new SimpleDateFormat("mm/dd/yy"); // memecah tanggal dari string

        Employee[] employee = new Employee[9]; // Dimasukkan array

        try {

//  Staff
            employee[0] = new Staff("Paita", "Allen", "123", "M", sdf.parse("2/23/59"), 50.00);

            employee[1] = new Staff("Steven", "Zapata", "456", "F", sdf.parse("7/12/64"), 35.00);

            employee[2] = new Staff("Enrique", "Rios", "789", "M", sdf.parse("6/2/70"), 40.00);

//  Faculty
            employee[3] = new Faculty("Anne", "Johnson", "243", "F", sdf.parse("4/27/62"), Faculty.Level.FU,
                    new Education("Ph.D", "Engineering", 3));

            employee[4] = new Faculty("William", "Bouris", "791", "F", sdf.parse("3/14/75"), Faculty.Level.AO,
                    new Education("Ph.D", "English", 1));

            employee[5] = new Faculty("Christopher", "Andrade", "623", "F", sdf.parse("5/22/80"), Faculty.Level.AS,
                    new Education("MS", "Physical Education", 0));


//  PartTime
            employee[6] = new PartTime("Augusto", "Guzman", "455", "F", sdf.parse("8/10/77"), 35.00, 30);

            employee[7] = new PartTime("Martin", "Depirro", "678", "F", sdf.parse("9/15/87"), 30.00, 15);

            employee[8] = new PartTime("Marque", "Aldaco", "945", "M", sdf.parse("11/24/88"), 20.00, 35);

            System.out.println("Employee Info in ascending order of employee id\n");

            Collections.sort(Arrays.asList(employee), new Comparator<Employee>() {

            // Sorting Array Ascending

                public int compare(Employee o1, Employee o2) {

                    return o1.getIdNumber().compareToIgnoreCase(o2.getIdNumber());

                }

            });

            for (Employee emp : employee) {

                System.out.println(emp.toString());

                System.out.println("");

            }

            System.out.println("Details of all STAFF employees\n");

            for (Employee emp : employee) {

                if (emp.getClass() == Staff.class) { //Cek objek Staff

                    System.out.println(emp.toString());

                    System.out.println("******");

                }

            }

            System.out.println();

            System.out.println("Details of all FACULTY employees\n");

            for (Employee emp : employee) {

                if (emp.getClass() == Faculty.class) { //Cek objek Faculty

                    System.out.println(emp.toString());

                    System.out.println("*****");

                }

            }

            System.out.println();

            System.out.println("Details of all PART TIME employees\n");

            for (Employee emp : employee) {

                if (emp.getClass() == PartTime.class) { //Cek objek PartTime

                    System.out.println(emp.toString());

                    System.out.println("*****");

                }

            }

            float total_salary_all_employees = 0;

            float total_salary_partime_employees = 0;

            for (Employee emp : employee) {

                if (emp.getClass() == PartTime.class) { //Cek objek PartTime

                    total_salary_partime_employees += emp.monthlyEarning();

                }

                total_salary_all_employees += emp.monthlyEarning();

            }

            System.out.println("\nTotal salary of all part time employees: " + total_salary_partime_employees);

            System.out.println("Total salary of all employees: " + total_salary_all_employees);

        } catch (ParseException e) {

            e.printStackTrace();

        }

    }


}

