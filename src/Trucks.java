public class Trucks implements Vehicle{

    private String type;
    private int weeks;

    public Trucks(String type, int weeks) {
        this.type = type;
        this.weeks = weeks;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeeks() {
        return weeks;
    }

    public void setWeeks(int weeks) {
        this.weeks = weeks;
    }

    @Override
    public double calculateRentalCost() {
        double total = 500 * getWeeks();
        return total;
    }

    @Override
    public void displayDetails() {
        System.out.println("Rental details : ");
        System.out.println("Truck type : "+getType());
        System.out.println("Weekly rental rate : $500");
        System.out.println("Rental cost : "+calculateRentalCost());
    }
}
