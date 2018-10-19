package dip.lab2.student.solution1;

import static dip.lab2.student.solution1.ServiceQuality.*;

public class TipCalculator implements ITipCalculator {
    public double getTip(FoodService fs) {
        double tip = 0.00; // always initialize local variables

        switch(fs.getServiceQuality()) {
            case GOOD:
                tip = fs.getBill() * GOOD.getTipPercent();
                break;
            case FAIR:
                tip = fs.getBill() * ServiceQuality.FAIR.getTipPercent();
                break;
            case POOR:
                tip = fs.getBill() * ServiceQuality.POOR.getTipPercent();
                break;
        }

        return tip;
    }

    public double getTip(BaggageService bs) {
        double tip = 0.00; // always initialize local variables

        switch(bs.getServiceQuality()) {
            case GOOD:
                tip = bs.getBaseTipPerBag() * bs.getBagCount() * (1 + GOOD.getTipPercent());
                break;
            case FAIR:
                tip = bs.getBaseTipPerBag() * bs.getBagCount() * (1 + FAIR.getTipPercent());
                break;
            case POOR:
                tip = bs.getBaseTipPerBag() * bs.getBagCount() * (1 + POOR.getTipPercent());
                break;
        }

        return tip;
    }
}
