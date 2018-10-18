package dip.lab1.student.solution1;

import java.text.NumberFormat;

/**
 * Startup class to demonstrate the DIP when compared to the initial classes.
 *
 * @author plee19
 * @version 1.00
 */
public class Startup {

    public static void main(String[] args) {

        Employee emp1 = new HourlyEmployee(10.50, 2020);
        Employee emp2 = new SalariedEmployee(45000, 1250);
        Employee emp3 = new SalariedEmployee(90000,0);
        Employee emp4 = new HourlyEmpWithIncentive(10.50, 2000, 50);

        Employee[] employees = {emp1, emp2, emp3, emp4};

        HRService hr = new HRService();

        NumberFormat nf = NumberFormat.getCurrencyInstance();

        for(int i = 0; i < employees.length; i++) {
            System.out.println("Employee " + (i+1) + " annual compensation: " + nf.format(hr.getAnnualCompensationForEmployee(employees[i])));
        }
    }

}
