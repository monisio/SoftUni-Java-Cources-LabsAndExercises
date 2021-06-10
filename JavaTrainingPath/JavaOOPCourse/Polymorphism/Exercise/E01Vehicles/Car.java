package JavaOOPCourse.Polymorphism.Exercise.E01Vehicles;

public class Car extends Vehicle {
    private static final double SUMMER_CONSUMPTION_INCREASE = 0.9;

    protected Car(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }

    @Override
    public String drive(double distance) {
        return super.drive(distance,SUMMER_CONSUMPTION_INCREASE);
    }

    @Override
    public void refuel(double liters) {

        setFuelQuantity(liters);
    }


}
