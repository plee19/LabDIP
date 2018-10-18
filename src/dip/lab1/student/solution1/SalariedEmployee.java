package dip.lab1.student.solution1;

/**
 * Class to implement Employee with unique set of properties. Responsible for the methods to manage its properties, and
 * the implemented getAnnualWages() method.
 *
 * @author plee19
 * @version 1
 */
public class SalariedEmployee implements Employee {
    private double annualSalary;
    private double annualBonus;

    /**
     * Constructor for SalariedEmployee using both available properties' setter methods.
     * @param annualSalary double Annual salary
     * @param annualBonus double Annual bonus
     */
    public SalariedEmployee(double annualSalary, double annualBonus) {
        setAnnualSalary(annualSalary);
        setAnnualBonus(annualBonus);
    }

    /**
     * Implementation of Employee method to return annual wages of SalariedEmployee.
     * @return double Annual wages
     */
    public double getAnnualWages() {
        return getAnnualSalary() + getAnnualBonus();
    }

    /**
     * Method to return annual salary of SalariedEmployee.
     * @return double Annual salary
     */
    public double getAnnualSalary() {
        return annualSalary;
    }

    /**
     * Method to set annual salary of SalariedEmployee.
     * @param annualSalary double Annual salary
     */
    private void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    /**
     * Method to return annual bonus of SalariedEmployee.
     * @return double Annual bonus
     */
    public double getAnnualBonus() {
        return annualBonus;
    }

    /**
     * Method to set annual bonus of SalariedEmployee.
     * @param annualBonus double Annual bonus
     */
    private void setAnnualBonus(double annualBonus) {
        this.annualBonus = annualBonus;
    }
}
