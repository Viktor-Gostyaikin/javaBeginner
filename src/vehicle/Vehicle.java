package vehicle;

public class Vehicle implements IVehicle {
    private int passengers; // количество пассажиров
    private int fuelCap;    // емкость топливного бака
    private int mpg;        // потребление топлива в милях на галлон

    Vehicle(int passengers, int fuelcap, int mpg) {
        this.passengers = passengers;
        this.fuelCap = fuelcap;
        this.mpg = mpg;
    }
    public int getPassengers() {return passengers;}
    public void setPassengers(int passengers) {this.passengers = passengers;}
    public int getFuelcap() {return fuelCap;}
    public void setFuelcap(int fuelCap) {this.fuelCap = fuelCap;}
    public int getMpg() {return mpg;}
    public void setMpg(int mpg) {this.mpg = mpg;}
    public int range() {
        return fuelCap * mpg;
    }
    public double fuelNeeded(int miles){
        return (double) miles / mpg;
    }
}
