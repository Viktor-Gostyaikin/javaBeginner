package vehicle;

public class TwoVehicle {
    public static void main(String[] args) {
        Vehicle miniVan = new Vehicle(7, 16, 21);
        Vehicle sportCar = new Vehicle(2, 14, 12);

//        int dist = 252;

        System.out.printf("Мини-фургон может перевезти %d пассажиров на растояние %d миль." +
                "\nОн затратит %.2f галлонов топлива",
                miniVan.getPassengers(), miniVan.range(),
                miniVan.fuelNeeded(miniVan.range())
        );
        System.out.println();
        System.out.printf("Спорткар может перевезти %d пассажиров на растояние %d миль." +
                "\nОн затратит %.2f галлонов топлива",
                sportCar.getPassengers(), sportCar.range(),
                sportCar.fuelNeeded(sportCar.range())
        );
    }
}
