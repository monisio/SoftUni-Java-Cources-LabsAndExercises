package JavaOOPCourse.Polymorphism.Exercise.E02VehicleExtended;

import JavaOOPCourse.Polymorphism.Exercise.E01Vehicles.Vehicle;

public class Bus extends Vehicle {
    private static final double FUEL_CONSUMPTION_INCREASE = 1.4;

    public Bus(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }

    public String drive(double distance, boolean isEmpty) {
        if (isEmpty) {
            return super.drive(distance, 0.0);
        }
        return this.drive(distance);
    }

    @Override
    public String drive(double distance) {
        return super.drive(distance, FUEL_CONSUMPTION_INCREASE);
    }

    @Override
    public void refuel(double liters) {
        setFuelQuantity(liters);

    }
}
