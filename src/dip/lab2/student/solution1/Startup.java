package dip.lab2.student.solution1;

import static dip.lab2.student.solution1.ServiceQuality.*;

public class Startup {
    static BaggageService bagServ = new BaggageService(5, 1.00, GOOD);
    static FoodService foodServ = new FoodService(15.00, FAIR);
    static TipCalculator tipCalc = new TipCalculator();

    public static void main(String[] args) {
        System.out.println(tipCalc.getTip(foodServ));
        System.out.println(tipCalc.getTip(bagServ));
    }
}
