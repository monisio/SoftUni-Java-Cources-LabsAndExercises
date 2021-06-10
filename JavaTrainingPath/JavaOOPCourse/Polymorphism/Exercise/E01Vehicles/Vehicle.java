package JavaOOPCourse.Polymorphism.Exercise.E01Vehicles;

import java.text.DecimalFormat;

public abstract class Vehicle implements VehicleInterface {

    protected double fuelQuantity;
    protected double fuelConsumption;
    protected double tankCapacity;


    protected Vehicle(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        this.tankCapacity = tankCapacity;
        this.fuelConsumption = fuelConsumption;
        this.fuelQuantity= fuelQuantity;
        //setFuelQuantity(fuelQuantity);
    }

    protected String driveMessage(double distance) {
        DecimalFormat df = new DecimalFormat("###.##");
        return this.getClass().getSimpleName() + " travelled " + df.format(distance) + " km";
    }

    protected void setFuelQuantity(double fuelQuantity) {
        if (fuelQuantity > 0) {
            if (fuelQuantity+this.fuelQuantity <= this.tankCapacity) {
                this.fuelQuantity += fuelQuantity;
            } else {
                System.out.println("Cannot fit fuel in tank");
            }

        } else {
            System.out.println("Fuel must be a positive number");
        }

    }



    protected String drive(double distance , double fuelConsumptionIncrease) {

        double fuelNeeded = distance * (fuelConsumption+fuelConsumptionIncrease);


        if (fuelNeeded <= this.fuelQuantity) {
            fuelQuantity -= fuelNeeded;
            return driveMessage(distance);
        }

        return this.getClass().getSimpleName() + " needs refueling";

    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ": " + String.format("%.2f", this.fuelQuantity);
    }


}
