package dip.lab1.student.solution1;

/**
 * Class to implement Employee with unique set of properties (annualBonus is the difference from HourlyEmployee).
 * Responsible for the methods to manage its properties, and the implemented getAnnualWages() method.
 *
 * @author plee19
 * @version 1
 */
public class HourlyEmpWithIncentive implements Employee {
    private double hourlyRate;
    private double hoursWorkedForYear;
    private double annualBonus;

    /**
     * Constructor method using all properties of HourlyEmpWithIncentive and their setter properties.
     * @param hourlyWage double Hourly wage of HourlyEmpWithIncentive
     * @param hoursWorkedForYear double Hours worked in a year for HourlyEmpWithIncentive
     * @param annualBonus double Annual bonus for HourlyEmpWithIncentive
     */
    public HourlyEmpWithIncentive(double hourlyWage, double hoursWorkedForYear, double annualBonus) {
        setHourlyRate(hourlyWage);
        setHoursWorkedForYear(hoursWorkedForYear);
        setAnnualBonus(annualBonus);
    }

    /**
     * Method to fulfill implementation requirement from Employee interface and return annual wages of
     * HourlyEmpWithIncentive.
     * @return double Annual wages of HourlyEmpWithIncentive
     */
    public double getAnnualWages() {
        return (getHourlyRate() * getHoursWorkedForYear()) + getAnnualBonus();
    }

    /**
     * Method to get hourly rate of HourlyEmpWithIncentive.
     * @return double Hourly rate of HourlyEmpWithIncentive
     */
    public double getHourlyRate() {
        return hourlyRate;
    }

    /**
     * Method to set hourly rate of HourlyEmpWithIncentive.
     * @param hourlyRate double hourly rate of HourlyEmpWithIncentive
     */
    private void setHourlyRate(double hourlyRate) {
        if(hourlyRate < 0 || hourlyRate > 500) {
            throw new IllegalArgumentException();
        }
        this.hourlyRate = hourlyRate;
    }

    /**
     * Method to get hours worked by HourlyEmpWithIncentive for the year.
     * @return double hours worked by HourlyEmpWithIncentive for the year
     */
    public double getHoursWorkedForYear() {
        return hoursWorkedForYear;
    }

    /**
     * Method to set hours worked by HourlyEmpWithIncentive for the year.
     * @param hoursWorkedForYear double Hours worked by HourlyEmpWithIncentive for the year
     */
    private void setHoursWorkedForYear(double hoursWorkedForYear) {
        if(hoursWorkedForYear < 0 || hoursWorkedForYear > 5000) {
            throw new IllegalArgumentException();
        }
        this.hoursWorkedForYear = hoursWorkedForYear;
    }

    /**
     * Method to get annual bonus for HourlyEmpWithIncentive.
     * @return double annual bonus for HourlyEmpWithIncentive
     */
    public double getAnnualBonus() {
        return annualBonus;
    }

    /**
     * Method to set annual bonus for HourlyEmpWithIncentive.
     * @param annualBonus double annual bonus for HourlyEmpWithIncentive
     */
    private void setAnnualBonus(double annualBonus) {
        if(annualBonus < 0 || annualBonus > 5000) {
            throw new IllegalArgumentException();
        }
        this.annualBonus = annualBonus;
    }
}
