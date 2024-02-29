public class Cars implements Vehicle {

    private String model;
    private int days;

    public Cars(String model, int days) {
        this.model = model;
        this.days = days;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    @Override
    public double calculateRentalCost() {
        double total = 50 * getDays();
        return total;
    }

    @Override
    public void displayDetails() {
        System.out.println("Rental details : ");
        System.out.println("Car model : "+getModel());
        System.out.println("daily rental rate : $50");
        System.out.println("Rental cost : "+calculateRentalCost());
    }
}
