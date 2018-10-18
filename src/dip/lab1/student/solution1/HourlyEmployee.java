package dip.lab1.student.solution1;

/**
 * Class to implement Employee with unique set of properties. Responsible for the methods to manage its properties,
 * and the implemented getAnnualWages() method.
 * @author plee19
 * @version 1
 */
public class HourlyEmployee implements Employee {
    private double hourlyRate;
    private double hoursWorkedForYear;

    /**
     * Constructor method using all properties of HourlyEmployee and their setter properties.
     * @param hourlyRate double Hourly rate for HourlyEmployee
     * @param totalHoursForYear double Total hours worked by HourlyEmployee for the year
     */
    public HourlyEmployee(double hourlyRate, double totalHoursForYear) {
        setHourlyRate(hourlyRate);
        setHoursWorkedForYear(totalHoursForYear);
    }

    /**
     * Method to fulfill implementation requirement from Employee interface and return annual wages of
     * HourlyEmployee.
     * @return double Annual wages of HourlyEmployee
     */
    @Override
    public double getAnnualWages() {
        return getHourlyRate() * getHoursWorkedForYear();
    }

    /**
     * Method to get hourly rate of HourlyEmployee.
     * @return double Hourly rate of HourlyEmployee
     */
    public double getHourlyRate() {
        return hourlyRate;
    }

    /**
     * Method to set hourly rate of HourlyEmployee.
     * @param hourlyRate double Hourly rate of HourlyEmployee
     */
    public void setHourlyRate(double hourlyRate) {
        if(hourlyRate < 0 || hourlyRate > 500) {
            throw new IllegalArgumentException();
        }
        this.hourlyRate = hourlyRate;
    }

    /**
     * Method to get hours worked by HourlyEmployee for the year.
     * @return double hours worked by HourlyEmployee for the year
     */
    public double getHoursWorkedForYear() {
        return hoursWorkedForYear;
    }

    /**
     * Method to set hours worked by HourlyEmployee for the year.
     * @param hoursWorkedForYear double Hours worked by HourlyEmpWithIncentive for the year
     */
    public void setHoursWorkedForYear(double hoursWorkedForYear) {
        this.hoursWorkedForYear = hoursWorkedForYear;
    }
}
