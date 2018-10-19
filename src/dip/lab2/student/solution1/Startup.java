package dip.lab2.student.solution1;

import java.text.NumberFormat;
import javax.swing.JOptionPane;


/**
 * Just a test class for input and output.
 *
 * 1. Create instances of low-level classes using Liskov Substitution principle.
 * 2. Create an instance of your high-level class.
 * 3. Pass one of your calculator instances to the high-level class and
 *    check the results.
 * 4. Now switch to a different calculator instance and pass that to the
 *    high-level class. Did it work? Are the low-level instances
 *    interchangeable? The DIP requires this.
 * 
 * @author your name goes here
 */
public class Startup {
 
    public static void main(String[] args) {
        TipCalculator calc = new BaggageServiceTipCalculator(2.00, 5, ServiceQuality.GOOD);
        TipCalculatorService tipService = new TipCalculatorService(calc);
        NumberFormat formatter = NumberFormat.getCurrencyInstance();

        JOptionPane.showMessageDialog(null, formatter.format(tipService.getTip()));

        calc = new FoodServiceTipCalculator(ServiceQuality.GOOD, 100.00);
        tipService = new TipCalculatorService(calc);
        JOptionPane.showMessageDialog(null, formatter.format(tipService.getTip()));
    }

}
