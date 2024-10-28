package WithoutStrategyPattern;

public class main {
    public static void main(String[] args) {
        Vehicle vehicle1 = new PassengerVehicle();
        vehicle1.drive();
        Vehicle vehicle2 = new SportsVehicle();
        vehicle2.drive();
        Vehicle vehicle3 = new OffLoadVehicle();
        vehicle3.drive();
    }
}
