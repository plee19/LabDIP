package dip.lab1.student.solution1;

/**
 * A high-level class that delegates to employee objects to run their getAnnualWages() method.
 *
 * @author plee19
 * @version 1
 */
public class HRService {
    /**
     * Method to delegate the employee to run its getAnnualWages() method.
     * @param e Employee employee to run its method
     * @return double Annual wages result from employee's getAnnualWages() method
     */
    public double getAnnualCompensationForEmployee(Employee e) {
        return e.getAnnualWages();
    }
}