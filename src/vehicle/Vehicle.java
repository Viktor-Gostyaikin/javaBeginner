package vehicle;

public class Vehicle {
    int passengers; // количество пассажиров
    int fuelcap;    // емкость топливного бака
    int mpg;        // потребление топлива в милях на галлон

    Vehicle(int passengers, int fuelcap, int mpg) {
        this.passengers = passengers;
        this.fuelcap = fuelcap;
        this.mpg = mpg;
    }
    int range() {
        return fuelcap * mpg;
    }
    double fuelNeeded(int miles){
        return (double) miles / mpg;
    }
}
