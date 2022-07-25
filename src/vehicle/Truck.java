package vehicle;

public class Truck extends Vehicle {
    private int cargoCap;

    Truck(int passengers, int fuelCap, int mpg, int carGoCap) {
        super(passengers, fuelCap, mpg);
        this.cargoCap = carGoCap;
    }
    int getCargo() {return cargoCap;}
    void putCarGo(int carGoCap) {this.cargoCap = carGoCap;}
}
