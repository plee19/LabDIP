package dip.lab2.student.solution1;

public enum ServiceQuality {
    GOOD(0.20),
    FAIR(0.15),
    POOR(0.10);

    private double tipPercent;
    ServiceQuality(double tipPercent) {
        this.tipPercent = tipPercent;
    }
    public double getTipPercent() {
        return tipPercent;
    }
}