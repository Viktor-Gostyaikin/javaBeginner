package vehicle;

public interface IVehicle {
    // Вернуть дальность поездки транспртоного средства
    int range();
    // Вычислить объем топливо, требующегося
    // для прохождения заданного пути
    double fuelNeeded(int miles);
    // Методы доступа к переменным экземпляра
    int getPassengers();
    void setPassengers(int p);
    int getFuelcap();
    void setFuelcap(int f);
    int getMpg();
    void setMpg(int m);
}
