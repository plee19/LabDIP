package dip.lab2.student.solution1;

public class FoodService implements IService {
    private static final double MIN_BILL = 0.00;
    private static final String BILL_ENTRY_ERR =
            "Error: bill must be greater than or equal to " + MIN_BILL;
    private static double bill;
    private static ServiceQuality serviceQuality;

    public FoodService(double bill, ServiceQuality sq) {
        this.setBill(bill);
        this.setServiceQuality(sq);
    }

    public static double getMinBill() {
        return MIN_BILL;
    }

    public double getBill() {
        return bill;
    }

    public void setBill(double bill) {
        if(bill < MIN_BILL) {
            throw new IllegalArgumentException(BILL_ENTRY_ERR);
        }
        this.bill = bill;
    }

    public ServiceQuality getServiceQuality() {
        return serviceQuality;
    }

    public void setServiceQuality(ServiceQuality sq) {
        this.serviceQuality = sq;
    }
}
