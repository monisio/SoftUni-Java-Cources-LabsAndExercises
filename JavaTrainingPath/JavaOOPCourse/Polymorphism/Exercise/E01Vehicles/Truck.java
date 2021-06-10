package JavaOOPCourse.Polymorphism.Exercise.E01Vehicles;

public class Truck extends Vehicle{
    private static final double SUMMER_CONSUMPTION_INCREASE = 1.6;
    private static final double TRUCK_TANK_CAPACITY_DECREASE= 0.95;


    protected Truck(double fuelQuantity, double fuelConsumption ,double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);

    }

    @Override
    public String drive(double distance) {
        return super.drive(distance, SUMMER_CONSUMPTION_INCREASE);
    }

    @Override
    public void refuel(double liters) {
       double actualFueledQuantity = liters * TRUCK_TANK_CAPACITY_DECREASE;
       setFuelQuantity(actualFueledQuantity);
    }


}
