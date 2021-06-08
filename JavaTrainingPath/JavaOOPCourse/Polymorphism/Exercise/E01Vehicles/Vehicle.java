package JavaOOPCourse.Polymorphism.Exercise.E01Vehicles;

public abstract class Vehicle {

    protected double fuelQuantity;
    protected double fuelConsumption;
    protected double possibleDistance;

    protected Vehicle(double fuelQuantity , double fuelConsumption , double factor){
        this.fuelQuantity= fuelQuantity;
        this.fuelConsumption= fuelConsumption+factor;
        calculatePossibleDistance();
    }

    protected String driveMessage(double distance){
        return " travelled "+distance + " km";
    }

    protected void calculatePossibleDistance(){
        this.possibleDistance = fuelQuantity/fuelConsumption;
    }

    public void drive(double distance){
        if (distance<=possibleDistance){
            fuelQuantity-= distance*fuelConsumption;
            calculatePossibleDistance();
            System.out.println(this.getClass().getSimpleName() + driveMessage(distance));
        }else {
            System.out.println(this.getClass().getSimpleName() + " needs refueling");
        }
    }

    @Override
    public String toString() {

        return this.getClass().getSimpleName() + " : " + this.fuelQuantity;
    }

    public  abstract void refuel(double liters);
}
