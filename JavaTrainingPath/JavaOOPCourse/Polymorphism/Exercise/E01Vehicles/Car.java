package JavaOOPCourse.Polymorphism.Exercise.E01Vehicles;

public class Car extends Vehicle {
    private static final double SUMMER_CONSUMPTION_INCREASE = 0.9;

    protected Car(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption, SUMMER_CONSUMPTION_INCREASE);
    }


    @Override
    public void refuel(double liters) {
        this.fuelQuantity+= liters;
    }



}
