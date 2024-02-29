public class Bikes implements Vehicle{

    private String brand;
    private int hours;

    public Bikes(String brand, int hours) {
        this.brand = brand;
        this.hours = hours;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public double calculateRentalCost() {
        double total = 10 * getHours();
        return total;
    }

    @Override
    public void displayDetails() {
        System.out.println("Rental details : ");
        System.out.println("Bike brand : "+getBrand());
        System.out.println("hourly rental rate : $10");
        System.out.println("Rental cost : "+calculateRentalCost());
    }
}
