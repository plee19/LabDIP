package dip.lab2.student.solution1;

public class TipCalculatorService {
    private TipCalculator tipCalculator;

    public TipCalculator getTipCalculator() {
        return tipCalculator;
    }

    public void setTipCalculator(TipCalculator tipCalculator) {
        this.tipCalculator = tipCalculator;
    }

    public TipCalculatorService(TipCalculator tc) {
        setTipCalculator(tc);
    }

    public double getTip() {
        return tipCalculator.getTip();
    }
}
