package JavaOOPCourse.Polymorphism.Exercise.E01Vehicles;

public class Truck extends Vehicle{
    private static final double SUMMER_CONSUMPTION_INCREASE = 1.6;
    private static final double TRUCK_TANK_CAPACITY_DECREASE= 0.95;


    protected Truck(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption,SUMMER_CONSUMPTION_INCREASE);

    }

    @Override
    public void refuel(double liters) {
        this.fuelQuantity+= liters*TRUCK_TANK_CAPACITY_DECREASE;
    }


}
